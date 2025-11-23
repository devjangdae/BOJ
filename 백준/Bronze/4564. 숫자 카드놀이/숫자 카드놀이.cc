#include <iostream>
#include <string>
 
using namespace std;
 
int main()
{
    int t;
    while (1) {
        cin >> t;
        if (t == 0) break;
 
        int temp = 1;
        while (to_string(t).length() != 1) {
            cout << t << " ";
            for (int i = 0; i < to_string(t).length(); i++) {
                temp *= (int)to_string(t)[i] - '0';
            }
            t = temp;
            temp = 1;
        }
        cout << t << "\n";
    }
 
    return 0;
}