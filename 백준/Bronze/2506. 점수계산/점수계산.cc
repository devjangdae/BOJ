#include<stdio.h>
int main(void) {
    int N, i, res[100];
    scanf("%d", &N);
    for (i = 0; i < N; i++) {
        scanf("%d", &res[i]); //채점 결과 입력 
    }
    //가산점 계산
    int tmp = 0,sum = 0;
    for (i = 0; i < N; i++) {
        if (res[i] == 1) {
            tmp++;
            res[i] = tmp;
            sum += tmp;
        }
        else if (res[i] == 0) {
            tmp = 0;//tmp초기화
            res[i] = tmp;
        }
    }
    printf("%d ", sum);

    return 0;
}