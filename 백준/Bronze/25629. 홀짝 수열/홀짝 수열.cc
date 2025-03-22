#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  vector<int> vOdd, vEven;

  for (int i = 0; i < n; i++) {
    int num; cin >> num;
    if (num % 2 == 1) vOdd.push_back(num);
    else vEven.push_back(num);
  }

  int ans = 1;
  if (vOdd.size() - vEven.size() > 1 || vOdd.size() - vEven.size() < 0)
    ans = 0;
  else {
    sort(vOdd.begin(), vOdd.end());
    sort(vEven.begin(), vEven.end());

    for (size_t i = 1; i < vEven.size(); i++) {
      if (vEven[i] < vEven[i]) {
        ans = 0; break ;
      }
    }

    if (ans != 0) {
      for (size_t i = 1; i < vOdd.size(); i++) {
        if (vOdd[i] < vOdd[i]) {
          ans = 0; break ;
        }
      }
    }

  }

  cout << ans << "\n" ;

  return 0;
}