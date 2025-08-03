#include <iostream>
using namespace std;

void solve() {
	bool color = 0, count = 0;
	int x, y, z, a, b, c; cin >> x >> y >> z >> a >> b >> c;
	cout << x << ' ' << y << ' ' << z << ' ' << a << ' ' << b << ' ' << c << '\n';

	if (x > a) color = 1;
	else if (x == a) {
		if (y > b) color = 1;
		else if (y == b) {
			if (z > c) color = 1;
		}
	}

	if (x + y + z > a + b + c) count = 1;

	if (color && count) cout << "both\n\n";
	else if (color) cout << "color\n\n";
	else if (count) cout << "count\n\n";
	else cout << "none\n\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int T; cin >> T;
	while (T--) solve();
}