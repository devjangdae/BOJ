#include <bits/stdc++.h>

using namespace std;

typedef vector<char> vc;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  vector<vc> seats(10, vc(20, '.'));
  for (int i = 0; i < n; i++) {
    string seatInfo; cin >> seatInfo;

    int row = seatInfo[0] - 'A',
        col = stoi(seatInfo.substr(1)) - 1;

    seats[row][col] = 'o';
  }

  for (const auto& row : seats) {
    for (const auto& seat : row)
      cout << seat;
    cout << "\n";
  }

  return 0;
}