#include <iostream>
using namespace std;

int T, N;
char c;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> T;
	while (T--) {
		cin >> N >> c;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) cout << c;
			cout << '\n';
			c++;
			if (c > 'Z') c = 'A';
		}
		cout << '\n';
	}
}