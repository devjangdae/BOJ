#include <iostream>
using namespace std;
typedef long long ll;

ll A, L;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> A;
	while (L * L < A) L++;

	for (int i = -2; i < L; i++) cout << 'x';
	cout << '\n';
	for (int i = 0; i < L; i++) {
		cout << 'x';
		for (int j = 0; j < L; j++) cout << '.';
		cout << 'x' << '\n';
	}
	for (int i = -2; i < L; i++) cout << 'x';
}