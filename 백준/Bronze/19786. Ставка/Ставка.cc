#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int cntCase; cin >> cntCase;

  for (int t = 0; t < cntCase; t++) {
    int a ,c, r, g, b;
    cin >> a >> c >> r >> g >> b;

    int red = a * (pow(r + 1, 2) + pow(g, 2) + pow(b, 2)) + c * min({r + 1, g, b});
    int green = a * (pow(r, 2) + pow(g + 1, 2) + pow(b, 2)) + c * min({r, g + 1, b});
    int blue = a * (pow(r, 2) + pow(g, 2) + pow(b + 1, 2)) + c * min({r, g, b + 1});

    if (red >= green && red >= blue) cout << "RED\n";
    else if (green >= red && green >= blue) cout << "GREEN\n";
    else cout << "BLUE\n";
  }

  return 0;
}