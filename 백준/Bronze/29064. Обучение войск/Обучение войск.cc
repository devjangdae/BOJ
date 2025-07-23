#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  vector<int> soldiers(n);
  int fullyTrained = 0;
  for (int i = 0; i < n; i++) {
    cin >> soldiers[i];
    if (soldiers[i] == 1) fullyTrained++;
  }

  int requiredTrained = n / 2 + n % 2 - fullyTrained;
  if (requiredTrained < 0)
    requiredTrained = 0;

  cout << requiredTrained << "\n";

  return 0;
}