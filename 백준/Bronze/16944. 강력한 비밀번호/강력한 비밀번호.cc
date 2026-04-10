#include <iostream>
#include <string>
#include <algorithm>
#define ll long long
using namespace std;

int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);
	ll len, i, cnt = 4;
	bool small = true, large = true, number = true, other = true;
	string s;

	cin >> len >> s;
	for (i = 0; i < len; i++)
	{
		if ('a' <= s[i] && s[i] <= 'z')
		{
			if (small)
			{
				small = false;
				cnt--;
			}
		}
		else if ('A' <= s[i] && s[i] <= 'Z')
		{
			if (large)
			{
				large = false;
				cnt--;
			}
		}
		else if ('0' <= s[i] && s[i] <= '9')
		{
			if (number)
			{
				number = false;
				cnt--;
			}
		}
		else if (other)
		{
			other = false;
			cnt--;
		}
	}

	cout << max(6 - len, cnt);
}