#include <iostream>
#include <string>
using namespace std;

int main() {
    int t, r;
    string s;

    cin >> t;
    for (int i = 0; i < t; i++) {
        cin >> r >> s;
        for (int k = 0; k < s.size();k++) {
            for (int j = 0; j < r; j++) {
                cout << s[k];
            }
        }
        cout << endl;
    }
    return 0;
}