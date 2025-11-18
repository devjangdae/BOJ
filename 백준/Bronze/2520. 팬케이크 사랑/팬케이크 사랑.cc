#include <stdio.h>

int main() {
    int T;
    scanf("%d", &T);
    double gram1[] = { 0.5, 0.5, 0.25, 0.0625, 0.5625 };
    int gram2[] = { 1, 30, 25, 10 };

    while (T--) {
        scanf("\n"); 
        int line1[5];
        int line2[4];
        int max = 1000000000;

        for (int i = 0; i < 5; i++) {
            scanf("%d", &line1[i]);
            int nowMax = line1[i] / gram1[i];
            if (max > nowMax) max = nowMax;
        }

        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            scanf("%d", &line2[i]);
            cnt += (line2[i] / gram2[i]);
        }

        if (max < cnt) {
            printf("%d\n", max);
        }
        else {
            printf("%d\n", cnt);
        }
    }
}
