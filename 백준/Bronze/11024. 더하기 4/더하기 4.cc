#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int T;
    cin >> T; // 테스트 케이스의 개수 입력

    cin.ignore(); // 이전의 개행 문자를 무시

    for (int i = 0; i < T; i++)
    {
        string line;
        getline(cin, line); // 한 줄 입력받기

        istringstream iss(line); // 입력된 문자열을 스트림으로 변환
        int number;
        int sum = 0;

        while (iss >> number)
        {
            sum += number; // 숫자를 읽어서 합계에 더하기
        }

        cout << sum << '\n'; // 각 테스트 케이스의 결과 출력
    }

    return 0;
}