#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a, b, c;
    int test;

    cin >> test;
    while(test--) {
        cin >> a >> b >> c;

        if ((a + b >= 10) || (b + c >= 10) || (a + c >= 10))
            cout << "Yes" << endl;
        else
            cout << "No" << endl;
    }
}