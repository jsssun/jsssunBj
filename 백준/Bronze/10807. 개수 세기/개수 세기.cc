#include <iostream>
using namespace std;

int main() {
    int n, v;
    int arr[101];

    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int ans = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    cin >> v;
    for (int i = 0; i < n; i++) {
        if (arr[i] == v)
            ans++;
    }
    cout << ans << endl;
}