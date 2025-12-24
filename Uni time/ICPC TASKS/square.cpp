#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int main()
{
    long long x, v;
    cin >> x >> v;
    bool isTrue = false;
    for (long long i = 1; i <= x; i++)
    {
        for (long long j = 0; j <= x; j++)
        {
            if (pow(i, 2) + pow(j, 2) == x)
            {
                isTrue = true;
            }
        }
    }

    bool isTrue2 = false;
    for (long long i = 1; i <= v; i++)
    {
        for (long long j = 0; j <= v; j++)
        {
            if (pow(i, 2) + pow(j, 2) == v)
            {
                isTrue2 = true;
            }
        }
    }
    if (isTrue2 && isTrue)
    {
        cout << "Yes"
             << "\n";
    }
    else
    {
        cout << "No"
             << "\n";
    }
    return 0;
}