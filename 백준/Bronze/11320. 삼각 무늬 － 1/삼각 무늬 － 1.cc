#include <iostream>
 
using namespace std;
 
int main()
{
    int t;
    cin >> t;
 
    int a, b;
    for (int i = 0; i < t; i++) 
    {
        cin >> a >> b;
 
        if (a == b)
        {
            cout << "1\n";
        }
        else 
        {
            int answer = a / b;
 
            for (int i = answer - 1; i > 0; i--)
            {
                answer += 2 * i;
            }
 
            cout << answer << "\n";
        }
    }
 
    return 0;
}