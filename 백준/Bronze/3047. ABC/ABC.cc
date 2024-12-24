#include <iostream>
#include <string>       // 문자열 string
#include <algorithm>    // sort
#include <vector>       // vector
 
using namespace std;
 
int main() {
 
    string str;
    vector<int> vec;
 
    for(int i=0; i<3; i++){
        int n;
        cin>>n;
        // 입력받은 3개의 n을 백터 배열에 넣는다.
        vec.push_back(n);
    }
 
    cin>>str;
 
    // 오름차순으로 정렬
    sort(vec.begin(), vec.end());
 
    int len = str.length();
 
    for(int i=0; i<len; i++){
        // 문자 'C'가 나오면 가장 큰수 출력
        if(str[i]=='C'){
            // 배열의 가장 마지막 수는 '\0', NULL값 즉, 쓰래기 값이기 때문에 -1을 꼭 해주어야 한다.
            cout<<vec[len-1]<<" ";
        }
        // 문자 'A'가 나오면 가장 작은 수 출력
        else if(str[i]=='A'){
            cout<<vec[0]<<" ";
        }
        // 문자 'B'가 나오면 가운데 수 출력
        else{
            cout<<vec[1]<<" ";
        }
    }
    return 0;
}