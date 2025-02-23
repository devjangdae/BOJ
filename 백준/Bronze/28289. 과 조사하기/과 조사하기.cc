#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int p; cin >> p;

  int software = 0, embedded = 0, ai = 0, noDept = 0;
  for(int i = 0; i < p; i++) {
    int grade, classNum, num;
    cin >> grade >> classNum >> num;

    if (grade == 1) noDept++;
    else if (classNum <= 2) software++;
    else if (classNum == 3) embedded++;
    else if (classNum == 4) ai++;
  }

  cout << software << "\n" << embedded << "\n" << ai << "\n" << noDept << "\n";

  return 0;
}