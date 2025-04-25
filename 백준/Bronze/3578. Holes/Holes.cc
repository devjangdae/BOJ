#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int h; cin >> h;

  if (h == 0) cout << "1\n";
  else if (h == 1) cout << "0\n";
  else {
    int cntEights = h / 2,
      rmd = h % 2;

    if (rmd == 1) cout << "4";

    for (int i = 0; i < cntEights; i++)
      cout << "8";
    cout << "\n";
  }

  return 0;
}