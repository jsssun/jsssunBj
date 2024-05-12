#include <iostream>
#include <queue>
using namespace std;

int heap[100001];
priority_queue<int, vector<int>, greater<int>> p_queue;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int N;
    cin >> N;

    for (int i = 0; i < N; i++) {
        int n;
        cin >> n;
        if (n == 0)
        {
            if (p_queue.empty())
            {
                cout << 0 << "\n";
            }
            else
            {
                cout << p_queue.top() << "\n";
                p_queue.pop();
            }
        }
        else
        {
            p_queue.push(n);
        }
    }
    return 0;
}