#include <iostream>
using namespace std;

int N, ans;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> N;
	for (int i = 1; i <= N; i++) {
		int x; cin >> x;
		ans = max(ans, x - (N - i + 1));
	}

	cout << ans;
}