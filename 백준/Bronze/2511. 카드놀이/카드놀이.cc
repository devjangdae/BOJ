#include <bits/stdc++.h>

int main(){
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(nullptr);
    
    int A[10];
    int B[10];
    int a = 0, b = 0;
    int lastWin = -1;
    for (int i = 0; i < 10; ++i){
        std::cin >> A[i];
    }

    for (int i = 0; i < 10; ++i){
        std::cin >> B[i];
    }

    for (int i = 0; i < 10; ++i){
        if (A[i] > B[i]){
            a += 3;
            lastWin = 1;
        }
        else if (A[i] < B[i]){
            b += 3;
            lastWin = 2;
        }
        else {
            ++a;
            ++b;
        }
    }

    std::cout << a << " " << b << "\n";
    if (a > b){
        std::cout << "A\n";
    }
    else if (a < b){
        std::cout << "B\n";
    }
    else {
        if (lastWin == -1)
            std::cout << "D\n";
        else if (lastWin == 1){
            std::cout << "A\n";
        }
        else {
            std::cout << "B\n";
        }
    }
    return 0;
}