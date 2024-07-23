#include <bits/stdc++.h>

using namespace std;

typedef map<int, string> mis;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int ottawaTime; cin >> ottawaTime;

  mis offsets = {
    {-300, "Victoria"},
    {-200, "Edmonton"},
    {-100, "Winnipeg"},
    {0, "Toronto"},
    {100, "Halifax"},
    {130, "St. John's"}
  };

  int ottawaHour = ottawaTime / 100,
      ottawaMin = ottawaTime % 100;

  cout << ottawaTime << " in Ottawa\n";
  for (const auto& offset : offsets) {
    int localHour = (ottawaHour + (offset.first / 100) + 24) % 24,
        localMin = (ottawaMin + (offset.first % 100)) % 60;

    if ((ottawaMin + (offset.first % 100)) >= 60)
      localHour = (localHour + 1) % 24;

    if (!localHour && !localMin) cout << "0";
    else if (localHour && !localMin) cout << localHour << "00";
    else if (!localHour && localMin) cout << localMin;
    else cout << localHour << localMin;

    cout << " in " << offset.second << "\n";
  }

  return 0;
}