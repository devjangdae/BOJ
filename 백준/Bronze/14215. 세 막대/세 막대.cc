#ifndef _CRT_SECURE_NO_WARNINGS
#define _CRT_SECURE_NO_WARNINGS
#endif
/*
14215_세 막대
1112KB	0ms
*/
#include <cstdio>

const int LM = 3;
int a[LM];

void bSort() {
	for (int i = 0; i < LM - 1; ++i) {
		for (int j = 0; j < LM - (i + 1); ++j) {
			if (a[j] < a[j + 1]) {
				int t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
		}
	}
}

int main() {
#ifdef _WIN32
	freopen("input.txt", "r", stdin);
#endif // _WIN32
	scanf("%d %d %d", &a[0], &a[1], &a[2]);
	bSort();
	
	int sum = a[1] + a[2];
	if (a[0] < sum) sum += a[0];
	else sum += sum - 1;

	printf("%d\n", sum);
	return 0;
}