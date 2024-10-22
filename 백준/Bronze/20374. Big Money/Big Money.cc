#include <iostream>
#include <string>
using namespace std;
typedef long long ll;

ll ans;
string s;
ll X, Y;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	while (cin >> s) {
		int slen = s.length();
		ans += stoll(s.substr(0, slen - 3)) * 100 + stoll(s.substr(slen - 2, 2));
	}

	X = ans / 100, Y = ans % 100;
	cout << X << '.';
	if (Y < 10) cout << 0;
	cout << Y;
}