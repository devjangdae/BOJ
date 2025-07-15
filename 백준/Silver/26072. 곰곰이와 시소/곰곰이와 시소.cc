#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
typedef long double ld;
typedef pair<int, int> pii;

int N, L;
pii arr[100000];

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cout << fixed;
	cout.precision(10);

	cin >> N >> L;
	for (int i = 0; i < N; i++) cin >> arr[i].first;
	for (int i = 0; i < N; i++) cin >> arr[i].second;

	ld l = 0, r = L;

	while (r - l > 0.000000001) {
		ld mid = (l + r) / 2;
		ld val = 0;
		for (int i = 0; i < N; i++) {
			ld x = arr[i].first, w = arr[i].second;
			val += (x - mid) * w;
		}

		if (val > 0) l = mid;
		else r = mid;
	}

	cout << (l + r) / 2;
}