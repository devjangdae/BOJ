#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  vector<int> nums(n);
  for (int i = 0; i < n; i++)
    cin >> nums[i];

  bool isAllCounted = true;
  int cur = 1;
  for (int i = 0; i < n; i++) {
    while (cur < nums[i]) {
      cout << cur << "\n";
      cur++;
      isAllCounted = false;
    }
    cur++;
  }

  if (isAllCounted) cout << "good job\n";

  return 0;
}