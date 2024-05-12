#include <iostream>
#include <map>
#include <algorithm>

using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(0);

	int N;
	int M;
	int card;

	cin >> N;
	map<int, int> arr;

	for (int i = 0; i < N; i++) {
		cin >> card;
		arr[card]++;
	}
	cin >> M;
	for (int i = 0; i < M; i++) {
		cin >> card;
		cout << arr[card] << " ";
	}
}