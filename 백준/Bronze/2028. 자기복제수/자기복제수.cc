#include <stdio.h>
#define _CRT_SECURE_NO_WARNIGS

//백준 2028번 코드
int a[30];
int main() {
	int n;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < n; i++) {
		if (a[i] > 99 && (a[i]*a[i])%1000==a[i]) {
			printf("YES\n");
			continue;
		}
		else if (a[i] > 9 && (a[i] * a[i]) % 100 == a[i]) {
			printf("YES\n");
			continue;
		}
		else if (a[i] > 0 && (a[i] * a[i]) % 10 == a[i]) {
			printf("YES\n");
			continue;
		}
		else {
			printf("NO\n");
			continue;
		}
	}

	return 0;
}