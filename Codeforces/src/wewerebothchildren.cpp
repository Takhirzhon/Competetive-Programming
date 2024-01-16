#include <bits/stdc++.h>

using namespace std;

int main()
{
    int test;
    int frogs;
    cin >> test;
    while (test--) {
        cin >>frogs;

        for(int k = 0; k < frogs; k++) {
            vector <int> hops(frogs);
            vector <int> frogsPassed(frogs + 1);


            for (int i = 0; i < frogs; i++) {
                cin >> hops[i];
            }

            int coordinate = 0;

            for (int i = 0; i < frogs; i++) {
                coordinate += hops[i];
                frogsPassed[coordinate]++;
            }

            int maxFrogs = *max_element(frogsPassed.begin(), frogsPassed.end());

            cout << maxFrogs << endl;
        }
    }
}