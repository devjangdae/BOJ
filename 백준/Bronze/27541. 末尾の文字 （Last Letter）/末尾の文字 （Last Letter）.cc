#include <iostream>
#include <string>
using namespace std;

int slen;
string s;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> slen >> s;
	if (s.back() == 'G') s.pop_back();
	else s += "G";

	cout << s;
}