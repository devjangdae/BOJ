#include <iostream>
using namespace std;

// 최대공약수(GCD)를 구하는 함수: 유클리드 호제법 사용
int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

// 최소공배수(LCM)를 구하는 함수
int lcm(int a, int b) {
    return a * b / gcd(a, b); // a와 b의 곱을 GCD로 나눈 값
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int T;
    cin >> T; // 테스트 케이스의 수 입력

    while (T--) {
        int a, b;
        cin >> a >> b; // 두 정수 입력
        cout << lcm(a, b) << ' ' << gcd(a, b) << '\n'; // LCM과 GCD 출력
    }

    return 0;
}