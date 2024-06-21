#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll n; cin >> n;

  ll maxSquares = 0, k = 1;
  while (n >= k * k) {
    n -= k * k;
    maxSquares++;
    k++;
  }

  cout << maxSquares << "\n";

  return 0;
}