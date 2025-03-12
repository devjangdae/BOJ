#include <iostream>
using namespace std;

int N;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N;
    if (N < 2025) cout << 2025;
    else if (N < 3025) cout << 3025;
    else if (N < 9801) cout << 9801;
    else cout << -1;
}