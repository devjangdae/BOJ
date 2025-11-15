#include <iostream>
#include <string>
using namespace std;

int main() {
	
	int alpha[26] = { 0, };

	while (true) {
		char c = 0;
		cin >> c;
		if (c == 0) break;
		if ('a' <= c && c <= 'z') alpha[c - 'a']++;
	}

	int bigest = 0;
	for (int i = 0; i < 26; i++) {
		if (bigest < alpha[i]) bigest = alpha[i];
	}

	for (int i = 0; i < 26; i++) {
		if (alpha[i] == bigest) cout << char('a'+ i);
	}

}