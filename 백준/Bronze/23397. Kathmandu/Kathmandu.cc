#include <iostream>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	bool chk = 0;

	int T, D, M; cin >> T >> D >> M;
	int old = 0;
	while (M--) {
		int x; cin >> x;
		if (x - old >= T) chk = 1;
		old = x;
	}
	if (D - old >= T) chk = 1;

	if (chk) cout << 'Y';
	else cout << 'N';
}