#include <stdio.h>
 
int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    int i, j, k;
    int check[16001] = { 0, };
    int max = 0;
    int result = 0;
    for (i = 1; i <= a; i++)
    {
        for (j = 1; j <= b; j++)
        {
            for (k = 1; k <= c; k++)
            {
                check[i+j+k]++;
            }
        }
    }
    for (int i = 1; i <= a+b+c; i++)
    {
        if (max < check[i])
        {
            max = check[i];
            result = i;
        }
        continue;
    }
    printf("%d", result);
}