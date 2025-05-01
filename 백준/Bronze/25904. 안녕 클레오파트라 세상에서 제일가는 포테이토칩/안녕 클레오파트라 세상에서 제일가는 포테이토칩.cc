#include <stdio.h>

int main()
{
    int n, x;
    int t[200];
    scanf("%d %d", &n, &x);
    for (int i=0; i<n; i++) {
        scanf("%d", &t[i]);
    }
    int i = 0;
    while (1) {
        if (t[i] < x) {
            printf("%d", i+1);
            break;
        }
        if (i == n-1) {
            i = 0;
            x += 1;
            continue;
        }
        i += 1;
        x += 1;
    }
}