#include <iostream>
using namespace std;
int _T, _N, _Res;
float _D, _V, _F, _C;
int main()
{
    ios_base::sync_with_stdio(false); // scanf와 동기화를 비활성화
    // cin.tie(null); 코드는 cin과 cout의 묶음을 풀어줍니다.
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> _T; // 테스트 케이스의 개수
    while (_T--) {
        cin >> _N >> _D; // 우주선의 개수, 목표 거리
        _Res = 0;
        while (_N--) {
            cin >> _V >> _F >> _C; // 최고 속도, 연료량, 연료 소비율
            if (_D <= _V * _F / _C) _Res++;
            /*
            연료소비율 * 시간 = 연료량 
            연료량 / 연료소비율 = 시간
            시간 * 속도 = 거리
            거리 = 연료량 / 연료소비율 * 속도
                 = 속도 * 연료량 / 연료소비율        
            */
        }
        cout << _Res << "\n";
    }
    return 0;
}