#include <iostream>
using namespace std;

int A, B, ans;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> A >> B;
	while (A != B) {
		int AA = max(A, B) - min(A, B), BB = min(A, B);
		A = AA, B = BB;
		ans++;
	}

	cout << ans;
}