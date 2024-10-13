using namespace std;
#include <iostream>
#include <string>
#include <cstring>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <deque>
#include <functional>
#include <cmath>
#include <map>
#include <set>
#define _CRT_SECURE_NO_WARNINGS
#define INF 987654321
#define ll long long
typedef pair<int, int> PII;
 
 
 
int main() {
    //없으면 시간초과 발생
    ios::sync_with_stdio(false);
    cin.tie(NULL);
 
    int t;
    cin >> t;
 
    while (t--) {
        int maxVal = -1000000;
        int minVal = 1000000;
        int n;
        cin >> n;
 
        while (n--) {
            int num;
            cin >> num;
 
            if (num > maxVal) maxVal = num;
            if (num < minVal) minVal = num;
        
        }
 
        cout << minVal << " " << maxVal << "\n";
    
    }
 
 
 
    return 0;
}
