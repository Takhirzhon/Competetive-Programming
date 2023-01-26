#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int main() {
    long long num;
    cin >> num;

    while (true) {

        cout << num << " ";
        if (num == 1) break;
        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = num * 3 + 1;
        }
    }
    cout << endl;

}