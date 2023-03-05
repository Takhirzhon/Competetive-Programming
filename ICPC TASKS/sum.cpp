#include <bits/stdc++.h>
using namespace std;

int sum(int num1, int num2) {
    int res;
    cin >> num1 >> num2;
    res = num1 + num2;
    return res;
}

int main() {
    int num1 = 0, num2 = 0;
    int res = sum(num1, num2);
    cout << res << endl;
    return 0;
}