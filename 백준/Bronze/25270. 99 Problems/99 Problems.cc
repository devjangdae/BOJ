#include <iostream>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int N; cin >> N;
	if (N < 99) cout << 99;
	else {
		int i = 0;
		while (1) {
			if ((N + i) % 100 == 99) {
				cout << N + i;
				break;
			}
			else if ((N - i) % 100 == 99) {
				cout << N - i;
				break;
			}
			i++;
		}
	}
}