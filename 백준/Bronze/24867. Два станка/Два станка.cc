 #include <iostream>
using namespace std;
typedef long long ll;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	ll K; cin >> K;
	ll A, X, B, Y; cin >> A >> X >> B >> Y;
	
	ll ans = 0;
	
	if (A < K) {
		ll timeleft = K - A;
		ll prod = timeleft * X;
		if (B < timeleft) {
			prod += (timeleft - B) * Y;
		}
		ans = max(ans, prod);
	}

	if (B < K) {
		ll timeleft = K - B;
		ll prod = timeleft * Y;
		if (A < timeleft) {
			prod += (timeleft - A) * X;
		}
		ans = max(ans, prod);
	}

	cout << ans;
}