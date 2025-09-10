#include <iostream>
#include <string>
using namespace std;

string s;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	getline(cin, s);

	for (auto& l : s) {
		if ('a' <= l && l <= 'z') {
			int ret = l - 'a' + 1;
			if (ret < 10) cout << 0;
			cout << ret;
		}
		else if ('A' <= l && l <= 'Z') {
			int ret = l - 'A' + 27;
			cout << ret;
		}
		else if ('0' <= l && l <= '9') cout << '#' << l;
		else cout << l;
	}
}