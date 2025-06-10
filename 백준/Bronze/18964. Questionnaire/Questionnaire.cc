#include <iostream>
using namespace std;

int N;
int even, odd;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> N;
	while (N--) {
		int x; cin >> x;
		if (x & 1) odd++;
		else even++;
	}

	if (odd > even) cout << 2 << ' ' << 1;
	else cout << 2 << ' ' << 0;
}