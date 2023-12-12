#include <stdio.h>
 
int main() {
 
    int n;
    int arr[100];
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d" ,& arr[i]);
 
        for (int j = 0; j < arr[i]; j++) { //arr[i]가 5라면 '='은 5개가 출력될것이다.
            printf("=");
        }
        printf("\n"); // 두개의 반복문이 끝나면 문장을 한칸 띄운다.
    }
}