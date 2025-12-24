#include <bits/stdc++.h>
#include <string.h>
#include <iostream>

using namespace std;

int main()
{
    long long n;
    cin >> n;

    long long num;
    cin >> num;
    if (n > 0)
    {
        if (num == 2)
        {
            long long count = 1;

            while (n / 2 != 0)
            {
                count++;
                n = n / 2;
            }

            cout << count << endl;
        }
        else if (num == 10)
        {
            string l = to_string(n);
            cout << l.length() << endl;
        }
        else if (num == 16)
        {
            ostringstream ss;
            ss << hex << n;
            string result = ss.str();

            cout << result.length() << endl;
        }
    }
    return 0;
}