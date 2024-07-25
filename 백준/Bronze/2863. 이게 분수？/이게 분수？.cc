#include <stdio.h>

int main()
{
    double nums[5];
    double max;
    int cnt = 0;

    for(int i = 0; i < 4; i++)
        scanf("%lf", &nums[i]);

    max = nums[0] / nums[2] + nums[1] / nums[3];

    for(int k = 1; k < 4; k++){ //총 회전은 3번 하므로
        nums[4] = nums[2];
        nums[2] = nums[3];
        nums[3] = nums[1];
        nums[1] = nums[0];
        nums[0] = nums[4];

        if(max < nums[0] / nums[2] + nums[1] / nums[3]) {
            max = nums[0] / nums[2] + nums[1] / nums[3];
            cnt = k; //그냥 cnt++로 해버리면, max값이 갱신될 때만 카운트가 되기때문에
        }            //몇번째 회전의 max값인지 알 수 있게 하기 위해 회전 카운트값인 k를 대입해줘야 한다.
    }

    printf("%d\n", cnt);

    return 0;
}