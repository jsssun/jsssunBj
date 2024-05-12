#include <iostream>
#include <queue>
using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    priority_queue<int, vector<int>> maxHeap;
    int N;
    cin >> N;

    for (int i = 0; i < N; i++) {
        int n;
        cin >> n;
        if (n == 0)
        {
            if (maxHeap.empty()==1)
            {
                cout << 0 << "\n";
            }
            else
            {
                cout << maxHeap.top() << "\n";
                maxHeap.pop();
            }
        }
        else
        {
            maxHeap.push(n);
        }
    }
}