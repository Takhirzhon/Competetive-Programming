#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int main() {
    int num;
    cin >> num;

    while (true) {

        cout << num << " ";
        if (num == 1) break;
        if (num % 2 == 0) {
            num / 2;
        } else {
            num * 3 + 1 ;
        }
    }
    cout << "\n";

};