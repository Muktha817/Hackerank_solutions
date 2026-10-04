#include <iostream>
#include <string>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string s;
    if (!(cin >> s)) return 0;

    int checker = 0;
    int duplicates = 0;

    for (char c : s) {
        int bit = 1 << (c - 'a');
        if ((checker & bit) != 0) {
            duplicates |= bit;
        } else {
            checker |= bit;
        }
    }

    bool found = false;
    for (char c : s) {
        int bit = 1 << (c - 'a');
        if ((duplicates & bit) != 0) {
            if (found) cout << " ";
            cout << c;
            duplicates &= ~bit;
            found = true;
        }
    }

    if (!found) {
        cout << "No duplicates";
    }
    cout << "\n";

    return 0;
}
