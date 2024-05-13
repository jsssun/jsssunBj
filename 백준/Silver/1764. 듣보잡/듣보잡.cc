#include <iostream>
#include <map>
#include <algorithm>
#include <string>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, M;
	int cnt = 0;
	map<string, bool>arr;
	string name;
	cin >> N >> M;
	int sum = N + M;
	for (int i = 0; i < sum; i++) {
		cin >> name;
		if (arr[name] == false)
		{
			arr[name] = true;
		}
		else
		{
			arr[name] = false;
			cnt++;
		}
	}
	cout << cnt << "\n";
	for (auto it : arr)
	{
		if (it.second == false)
		{
			cout << it.first << "\n";
		}
	}
	return 0;
}