#include <iostream>
using namespace std;

int main() {

  int arr[5][4];
  int score = 0;
  int winner = 0;
  for (int i = 0; i < 5; i++) {
    int sum = 0;
    for (int k = 0; k < 4; k++) {
      cin >> arr[i][k];
      sum += arr[i][k];
    }
    if (sum > score) {
      score = sum;
      winner = i + 1;
    }
  }
  cout << winner << " " << score << "\n";

  return 0;
}