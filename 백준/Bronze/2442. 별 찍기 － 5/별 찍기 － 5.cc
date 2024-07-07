#include <stdio.h>

int main()
{
    int input;
    int i,j;
    
    scanf("%d",&input);
    
    for(i=1;i<=input;i++) // N번줄 및 개행 반복하기 위한 for문
    {
        for(j=input-i;j>0;j--) // 공백을 출력하기 위한 for문
            printf(" ");
        
        for(j=0;j<2*i-1;j++) // *을 출력하기 위한 for 문
            printf("*");
        
        printf("\n");
    }
    
    return 0;
}