#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  vector<bool> isFinished(n + 1, false);
  isFinished[0] = true;

  for (int i = 0; i < n - 1; i++) {
    int num; cin >> num;
    isFinished[num] = true;
  }

  for (int i = 1; i <= n; i++) {
    if (!isFinished[i]) {
      cout << i << "\n";
      break ;
    }
  }

  return 0;
}