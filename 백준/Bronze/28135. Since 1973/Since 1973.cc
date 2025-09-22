#include <iostream>
#include <string>

using namespace std;

int n, cnt;

int main() {
	cin >> n;

	for (int i = 0; i < n; i++) {
		if (to_string(i).find("50") == string::npos) {
			cnt += 1;
		}
		else {
			cnt += 2;
		}
	}

	cout << cnt;

	return 0;
}