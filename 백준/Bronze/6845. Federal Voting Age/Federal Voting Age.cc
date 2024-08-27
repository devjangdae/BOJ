#include <bits/stdc++.h>

using namespace std;

bool enableToVote(int year, int month, int day) {
  if (year > 2007 || (year == 2007 && month > 2) || (year == 2007 && month == 2 && day > 27))
    return false;

  if (year < 1989 || (year == 1989 && month < 2) || (year == 1989 && month == 2 && day <= 27))
    return true;

  return false;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  for (int i = 0; i < n; i++) {
    int year, month, day;
    cin >> year >> month >> day;

    if (enableToVote(year, month, day))
      cout << "Yes" << "\n";
    else
      cout << "No" << "\n";
  }

  return 0;
}