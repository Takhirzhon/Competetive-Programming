#include <iostream>
#include <string>

using namespace std;

int main() {
    int test;
    cin >> test;
    string word = "aaa";
    while (test--) {
        int code;
        cin >> code;

        for (int i = 2; i >= 0 && code > 0; --i) {
                int value = min(code - i, 26);
                word[i] = 'a' + value - 1;
                code -= value;
            }

        cout << word << endl;
    }
    return 0;
}
