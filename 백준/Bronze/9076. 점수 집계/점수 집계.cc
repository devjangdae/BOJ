#include <iostream>
#include <algorithm>
using namespace std;
 
int main()
{
	int t;
	cin >> t;
	
	for(int i = 0; i < t; i++){
		int s[5];
		for(int j = 0; j < 5; j++){
			cin >> s[j];
		}
		sort(s, s+5);
		if((s[3] - s[1]) >= 4)
			cout << "KIN" << "\n";
		else
			cout << s[1] + s[2] + s[3] << "\n";
	} 
}