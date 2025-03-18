#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable: 4996)
#include <iostream>
#define endl '\n'
using namespace std;

//백준 14909번 코드
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);	cout.tie(NULL);

	int num = 0;
	while (1) {
		int a;
		cin >> a;
		if (cin.eof() == 1) { break; }
		if (a > 0) { num++; }
	}
	cout << num << endl;
}