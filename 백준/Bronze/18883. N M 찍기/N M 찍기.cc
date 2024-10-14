#include <bits/stdc++.h>
  using namespace std;

  int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, m; cin >> n >> m;

  int cnt = 1;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      cout << cnt;
      cnt++;
      if (j == (m - 1)) cout << "\n";
      else cout << " ";
    }
  }

  return 0;
}