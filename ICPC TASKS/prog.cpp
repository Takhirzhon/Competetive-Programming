#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int max = 0;
    for (int i = 0; i < n; i++)
    {
        for (int x = 0; x < n; x++)
        {
            if (2 * i + 5 * x <= n)
            {
                if (pow(2, i) * pow(5, x) >= max)
                {
                    max = pow(2, i) * pow(5, x);
                }
            }
            else
            {
                break;
            }
        }
    }
    cout << (max % 2022) << "\n";
    return 0;
}