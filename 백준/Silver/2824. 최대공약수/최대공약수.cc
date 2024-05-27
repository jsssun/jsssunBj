#include <iostream>
#define INF 1000000000
using namespace std;

long long gcd(long long a, long long b) {
    return b % a ? gcd(b % a, a) : a;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n, m;
    int a[1000], b[1000];
    long long result = 1;
    bool isLarge = false;

    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    cin >> m;
    for (int i = 0; i < m; i++) {
        cin >> b[i];
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            long long gc;
            if (a[i] < b[j])
                gc = gcd(a[i], b[j]);
            else
                gc = gcd(b[j], a[i]);

            result *= gc; 
            a[i] /= gc;
            b[j] /= gc;

            if (result >= INF) {
                result %= INF;
                isLarge = true;
            }
        }
    }

    if (isLarge) {
        printf("%09lld", result);
    } else {
        cout << result;
    }

    return 0;
}