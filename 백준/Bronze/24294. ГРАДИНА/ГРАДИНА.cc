#include <bits/stdc++.h>
using namespace std;
int w1, h1, w2, h2;
int main(){
    cin >> w1 >> h1 >> w2 >> h2;
    cout << 4 + 2 * max(w1, w2) + 2 * (h1 + h2);
}