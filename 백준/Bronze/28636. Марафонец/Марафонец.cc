#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  int totalMinutes = 0, totalSeconds = 0;
  for (int i = 0; i < n; i++) {
    string time; cin >> time;
    int minutes = stoi(time.substr(0, 2));
    int seconds = stoi(time.substr(3, 2));

    totalMinutes += minutes;
    totalSeconds += seconds;
  }

  totalMinutes += totalSeconds / 60;
  totalSeconds %= 60;

  int hours = totalMinutes / 60;
  totalMinutes %= 60;

  cout << setw(2) << setfill('0') << hours << ":"
       << setw(2) << setfill('0') << totalMinutes << ":"
       << setw(2) << setfill('0') << totalSeconds << "\n";

  return 0;
}