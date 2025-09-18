#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  vector<int> v(n);
  for (int i = 0; i < n; i++)
    cin >> v[i];

  int cntPush = 0;
  for (int i = 0; i < n; i++) {
    while (i < n - 1 && v[i] > v[i + 1])
      i++;
    cntPush++;
  }

  cout << cntPush << "\n";

  return 0;
}