#include <iostream>
#include <algorithm>
#define ll long long
using namespace std;

int main(void)
{
    ios_base::sync_with_stdio(false); cin.tie(NULL);
    ll N, i, mn[2] = { (ll)(2e9),(ll)(2e9) }, idx = 0, x;
    cin >> N;
    for (i = 1; i <= N; i++)
    {
        cin >> x;
        if (x == -1) idx++;
        else mn[idx] = min(mn[idx], x);
    }
    cout << mn[0] + mn[1];
}