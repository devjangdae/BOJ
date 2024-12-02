#ifndef _CRT_SECURE_NO_WARNINGS
#define _CRT_SECURE_NO_WARNINGS
#endif
/*
3009_네 번째 점
1112KB	0ms
*/
#include <cstdio>

int main(){
#ifdef _WIN32
	freopen("input.txt", "r", stdin);
#endif // _WIN32
	int x1, y1, x2, y2, x3, y3;
	scanf("%d %d %d %d %d %d", &x1, &y1, &x2, &y2, &x3, &y3);
	
	int x, y;

	if (x1 == x2) x = x3;
	else if (x1 == x3) x = x2;
	else x = x1;

	if (y1 == y2) y = y3;
	else if (y1 == y3) y = y2;
	else y = y1;

	printf("%d %d\n", x, y);
	return 0;
}