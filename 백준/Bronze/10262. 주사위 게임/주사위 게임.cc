#include <bits/stdc++.h>
using namespace std;
int a, b, c, d, a1, b1, c1, d1;
double getAVG(int f, int e){
    double ret = 0;
    for(int i = f; i <= e; i++) ret += i;
    ret /= (e - f + 1);
    return ret;
}
int main(){
    cin >> a >> b >> c >> d;
    cin >> a1 >> b1 >> c1 >> d1;
    double _a = getAVG(a, b);
    double _a2 = getAVG(c, d);
    double _b = getAVG(a1, b1);
    double _b2 = getAVG(c1, d1);
    if(_a + _a2 == _b + _b2) cout << "Tie" << "\n";
    else if(_a + _a2 > _b + _b2)cout << "Gunnar" << "\n";
    else cout << "Emma" << "\n";
    return 0;
}