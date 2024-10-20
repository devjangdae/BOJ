#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  ll a, b; cin >> a >> b;

  ll minCristal = ((b + 1) * (2 + b * (a - 2))) / 2;
  cout << minCristal << "\n";

  return 0;
}