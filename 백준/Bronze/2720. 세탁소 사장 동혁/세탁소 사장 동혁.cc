#ifndef _CRT_SECURE_NO_WARNINGS
#define _CRT_SECURE_NO_WARNINGS
#endif

#include <cstdio>

int units[] = { 25, 10, 5, 1 };

int main() {
#ifdef _WIN32
	freopen("input.txt", "r", stdin);
#endif // _WIN32
	int t, c;
	scanf("%d", &t);

	while (t--) {
		scanf("%d", &c);
		for (int i = 0; i < 4; ++i) {
			printf("%d ", c / units[i]);
			c %= units[i];
		}
		puts("");
	}
	return 0;
}