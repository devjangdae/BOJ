#include <iostream>
using namespace std;

int x1, y1, f1, x2, y2, f2;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int T; cin >> T;
	while (T--) {
		cin >> x1 >> y1 >> f1 >> x2 >> y2 >> f2;
		cout << abs(x1 - x2) + abs(y1 - y2) + f1 + f2 << '\n';
	}
}