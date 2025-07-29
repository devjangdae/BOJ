#include <iostream>
#include <string>
using namespace std;

int cnt[128];
bool even = 1, odd = 1;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	string s; cin >> s;
	for (auto& l : s) cnt[l]++;
	for (int i = 'a'; i <= 'z'; i++) {
		if (cnt[i]) {
			if (cnt[i] & 1) even = 0;
			else odd = 0;
		}
	}

	if (even) cout << 0;
	else if (odd) cout << 1;
	else cout << 2;
}