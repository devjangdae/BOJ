#include <iostream>
using namespace std;

int cur, N, M;
int A[100], B[1001];

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> N;
	for (int i = 0; i < N; i++) cin >> A[i];
	cin >> M;
	for (int i = 0; i < M; i++) {
		int x; cin >> x;
		B[x] = 1;
	}

	for (int i = 0; i < N; i++) {
		cur += A[i];
		if (B[cur]) cur = 0;
	}

	cout << cur;
}