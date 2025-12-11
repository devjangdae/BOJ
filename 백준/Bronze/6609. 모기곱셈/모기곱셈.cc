#include <bits/stdc++.h>
using namespace std;
int m, p, l, e, r, s, n;
int main(){
    while(cin >> m >> p >> l >> e >> r >> s >> n){
        for(int i = 0; i < n; i++){
            int larva = m*e;
            int adult = p/s;
            int pupa = l/r;

            m = adult;
            p = pupa;
            l = larva;
        }
        cout << m << '\n';
    }
}