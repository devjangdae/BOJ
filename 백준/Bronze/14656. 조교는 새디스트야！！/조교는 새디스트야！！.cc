#include <iostream>
#include <vector>
using namespace std;

int main() {
	
	int input, a;
	cin >> input;

	int count = 0;

	vector<int> compVec;
	vector<int> numbers;

	for (int i = 0; i < input; i++) {
		cin >> a;
		numbers.push_back(i + 1);
		compVec.push_back(a);
		if (numbers[i] != compVec[i]) {
			count++;
		}
	}
	compVec.clear();
	numbers.clear();
	
	cout << count << "\n";


	return 0;
}