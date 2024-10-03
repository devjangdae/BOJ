#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <stack>
#include <queue>
#include <map>
#include <algorithm>
#include<numeric>

// https://www.acmicpc.net/problem/16283

class CTotalCount
{
private:
	/* 지폐수 */
	int N;
	/* 묶음 */
	int M;

public:
	CTotalCount()
	{
	}

	~CTotalCount()
	{
	}

	void getInputFromUser()
	{
		std::string inputString;
		std::getline(std::cin, inputString);
		std::stringstream ss(inputString);
		ss >> N;
		ss >> M;
	}

	void findAnswer()
	{
		int answer = N;
		int tempVal = N;

		while (true)
		{
			tempVal = tempVal / M;

			if (tempVal == 0)
			{
				break;
			}
			else
			{
				answer = answer + tempVal;
			}
		}

		std::cout << answer;
	}
};

int main()
{
	std::cin.tie(NULL);
	std::ios::sync_with_stdio(false);

	CTotalCount* cTotalCount = new CTotalCount();

	cTotalCount->getInputFromUser();
	cTotalCount->findAnswer();
}