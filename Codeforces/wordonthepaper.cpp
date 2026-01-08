#include <bits/stdc++.h>

using namespace std;

int main() {
    int test;
    cin >> test;

    while (test--) {
        char input;
        string word = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cin >> input;
                for(char k = 'a'; k <= 'z'; k++) {
                    if (input == k) {
                        word += k;
                    }
                }
            }
        }
        cout << word << endl;
    }
}