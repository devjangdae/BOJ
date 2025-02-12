#include <iostream>
#include <algorithm>
using namespace std;

int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);
	int N, i, mx = -2e9, mn = 2e9, x, y;

	cin >> N;
	for (i = 0; i < N; i++)
	{
		cin >> x >> y;
		mx = max(mx, y);
		mn = min(mn, y);
	}

	cout << mx - mn;
}