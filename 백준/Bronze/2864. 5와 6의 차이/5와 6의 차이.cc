#define _CRT_SECURE_NO_WARNINGS
#include <iostream> 
#include <algorithm>
#include <string>
#include <vector>
using namespace std;

int main() {
    
    string a, b;
    cin >> a >> b ;

    string r = a;
    string x = b;

    for (int i = 0; i < a.size(); i++) {
        if (a[i] == '6') {
            a[i] = '5';
        }
    }
    
    for (int i = 0; i < b.size(); i++) {
        if (b[i] == '6') {
            b[i] = '5';
        }
    }
    int c= stoi(a) + stoi(b);

    for (int i = 0; i < r.size(); i++) {
        if (r[i] == '5') {
            r[i] = '6';
        }
    }
    for (int i = 0; i < x.size(); i++) {
        if (x[i] == '5') {
            x[i] = '6';
        }
    }
    int d = stoi(r) + stoi(x);

    cout << c << " " << d; ;
    
    
    return 0;
}