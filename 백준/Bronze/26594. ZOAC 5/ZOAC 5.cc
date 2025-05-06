#include <iostream>
#include <string>
using namespace std;

int cnt[128];
string s;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> s;
	for (auto& l : s) cnt[l]++;

	cout << cnt[s[0]];
}