#include <iostream>
using namespace std;

int days[13] = { 0,31,29,31,30,31,30,31,31,30,31,30,31 };

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	int T; cin >> T;
	while (T--) {
		int x, y; cin >> x >> y;
		if (0 <= x && x <= 23 && 0 <= y && y <= 59) cout << "Yes ";
		else cout << "No ";

		if (1 <= x && x <= 12) {
			if (1 <= y && y <= days[x]) cout << "Yes\n";
			else cout << "No\n";
		}
		else cout << "No\n";
	}
}