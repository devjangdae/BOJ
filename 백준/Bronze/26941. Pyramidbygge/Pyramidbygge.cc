#include <iostream>
using namespace std;

int N;
int k = 1;
int ans;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> N;
	while (N >= k * k) {
		N -= k * k;
		k += 2, ans++;;
	}

	cout << ans;
}