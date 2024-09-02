#pragma warning(disable : 4996)
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
 
 
int arr[51];
 
int main() {
    int sum = 0;
    int ans = 0;
    int n, time;
    cin >> n >> time;
 
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
 
        sum += arr[i];
 
        if (sum <= time) {
            ans++;
        }
    }
 
    cout << ans << "\n";
 
    return 0;
}