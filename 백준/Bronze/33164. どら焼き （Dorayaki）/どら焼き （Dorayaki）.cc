#include <iostream>
using namespace std;

int N, M, ans;
int A[100], B[100];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> N >> M;
    for (int i = 0; i < N; i++) cin >> A[i];
    for (int i = 0; i < M; i++) cin >> B[i];

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            ans += (A[i] + B[j]) * max(A[i], B[j]);
        }
    }

    cout << ans;
}