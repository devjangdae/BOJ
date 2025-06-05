#include <iostream>
using namespace std;

int N, cnt1, cnt2;
string A, B;
int X[128][128];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    X['R']['P'] = X['P']['S'] = X['S']['R'] = 1;
    X['P']['R'] = X['S']['P'] = X['R']['S'] = -1;
    cin >> N >> A >> B;
    for (int i = 0; i < N; i++) {
        if (X[A[i]][B[i]] < 0) cnt1++;
        else if (X[A[i]][B[i]] > 0) cnt2++;
    }

    cout << cnt1 << ' ' << cnt2;
}