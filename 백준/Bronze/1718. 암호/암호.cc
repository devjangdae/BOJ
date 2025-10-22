#include <iostream>
#include <string>
#include <vector>

using namespace std;

string str; 
string key; 

vector<char> res;

int main() {
	
	getline(cin, str);
	getline(cin, key);

	const char* char_arr = str.c_str();
	const char* key_arr = key.c_str();

	for (int i = 0; i < str.size(); i++) {
		if (char_arr[i] == ' ') {
			res.push_back(char_arr[i]);
			continue;
		}

		char ch = char_arr[i] - (key_arr[i % key.size()] - 'a' + 1);

		if (ch < 'a') {
			ch += 26;
		}

		res.push_back(ch);
	}

	for (int i = 0; i < res.size(); i++) {
		cout << res[i];
	}
}