#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n;
	int jinju = 0; // jinju의 교통편 요금 저장
	int count = 0; // jinju 교통편 요금보다 비싼 경우 개수 파악
	vector<int> num;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		string d;
		int c;

		cin >> d >> c;

		if (d == "jinju") { // jinju 교통 요금 저장
			jinju = c;
		}
		else {
			num.push_back(c); // 아닌 경우 num에 요금 추가해서 추후 jinju 요금이랑 비교
		}
	}

	for (int i = 0; i < num.size(); i++)
	{
		if (num[i] > jinju) { // jinju 요금보다 큰 경우만 count 개수 증가
			++count;
		}
	}

	cout <<jinju<<"\n"<<count;
}