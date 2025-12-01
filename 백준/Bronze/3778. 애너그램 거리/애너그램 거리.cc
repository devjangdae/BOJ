#include <iostream>
#include <string>
#include <stdlib.h>
using namespace std;
#define fastio cin.tie(0) -> ios::sync_with_stdio(0);
int main() {
	fastio;
	int n;
	cin >> n;
	cin.ignore();
	for (int i = 1; i <=n; i++) {
		string a;
		string b;
		int chkA[27] = { 0, };
		int chkB[27] = { 0, };
		getline(cin, a);
		getline(cin, b);

		for (int j = 0; j < a.size(); j++) {
			chkA[(a[j] - 97)]++;
		}

		for (int j = 0; j < b.size(); j++) {
			chkB[(b[j] - 97)]++;
		}

		int sum = 0;
		for (int l = 0; l < 27; l++) {
			for (int k = l; k < 27; k++) {
					sum += abs(chkA[l] - chkB[k]);
					l++;
			}
		}
		cout << "Case #" << i << ": " << sum << '\n';
	}

}