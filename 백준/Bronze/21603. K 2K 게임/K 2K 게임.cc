#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, k; cin >> n >> k;

  int modK = k % 10, mod2K = (2 * k) % 10;

  vector<int> res;

  for (int i = 1; i <= n; i++) {
    if (i % 10 != modK && i % 10 != mod2K)
      res.push_back(i);
  }

  cout << res.size() << "\n";
  for (const auto& num : res)
    cout << num << " ";

  return 0;
}