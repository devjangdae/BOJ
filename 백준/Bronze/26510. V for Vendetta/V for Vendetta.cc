#include <iostream>
using namespace std;

int N;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	while (cin >> N) {
		for (int i = 0; i + 1 < N; i++) {
			for (int j = 0; j < i; j++) cout << ' ';
			cout << '*';
			for (int j = 0; j < 2 * (N - i) - 3; j++) cout << ' ';
			cout << '*' << '\n';
		}

		for (int i = 1; i < N; i++) cout << ' ';
		cout << '*' << '\n';
	}
}