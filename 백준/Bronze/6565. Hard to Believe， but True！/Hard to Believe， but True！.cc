#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
using namespace std;

int main() {
	fastio;
	string s, a, b, c;
	while (cin >> s) {
		for (auto& i : s) if (!isdigit(i)) i = ' ';
		stringstream in(s);
		in >> a >> b >> c;
		reverse(a.begin(), a.end());
		reverse(b.begin(), b.end());
		reverse(c.begin(), c.end());
		cout << (stoi(a) + stoi(b) == stoi(c) ? "True" : "False") << '\n';
	}
}