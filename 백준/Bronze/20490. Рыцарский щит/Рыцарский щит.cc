#include <iostream>
using namespace std;

int A, B, C, X, Y, Z, P, Q;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> A >> B >> C >> X >> Y >> Z;
    P = max(A, max(B, C)), Q = max(X, max(Y, Z));
    cout << A + B + C + X + Y + Z - min(P, Q) * 2;
}