#include <bits/stdc++.h>

using namespace std;

int main() {
    int testCases;
    cin >> testCases;
    while (testCases--) {
        int cut = 0;
        int n;
        cin >> n;
        while (n--) {
            int height, lengthOfRope;
            cin >> height >> lengthOfRope;
            if (height > lengthOfRope) {
                cut++;
            }
        }
        cout << cut << endl;

    }
    return 0;
}