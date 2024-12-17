#include <iostream>
#include <string>
using namespace std;

string s;
int cnt[128];

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> s >> s;
	for (auto& l : s) cnt[l]++;

	if (cnt['b'] > cnt['s']) cout << "bigdata?";
	else if (cnt['b'] < cnt['s']) cout << "security!";
	else cout << "bigdata? security!";
}