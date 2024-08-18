#include <bits/stdc++.h>

using namespace std;

typedef map<string, double> msd;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  msd supplies;
  supplies["Paper"] = 57.99;
  supplies["Printer"] = 120.50;
  supplies["Planners"] = 31.25;
  supplies["Binders"] = 22.50;
  supplies["Calendar"] = 10.95;
  supplies["Notebooks"] = 11.20;
  supplies["Ink"] = 66.95;

  double totalCost = 0.0;
  string item;
  while (getline(cin, item) && item != "EOI")
    totalCost += supplies[item];

  cout.setf(ios::fixed); cout.precision(2);
  cout << "$" << totalCost << "\n";

  return 0;
}