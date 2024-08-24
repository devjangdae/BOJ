#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t; cin >> t;

  for (int i = 1; i <= t; i++) {
    int sides[3];
    cin >> sides[0] >> sides[1] >> sides[2];

    sort(sides, sides + 3);

    cout << "Case #" << i << ": ";

    if (pow(sides[0], 2) + pow(sides[1], 2) == pow(sides[2], 2))
      cout << "YES\n";
    else cout << "NO\n";
  }

  return 0;
}