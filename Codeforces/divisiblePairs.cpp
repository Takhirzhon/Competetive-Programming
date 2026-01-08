#include <bits/stdc++.h>
using namespace std;

int countKdivPairs(int A[], int n, int x, int y)
{
    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if ((A[i] + A[j]) % x == 0 && (A[i] - A[j]) % y == 0) {
                count++;
            }
        }
    }
    return count;
}

int main() {
    int test;
    cin >> test;
    while (test--) {
        int n, x, y;
        cin >> n >> x >> y;
        int array[n];
        for (int i = 0; i < n; i++) {
            cin >> array[i];
        }
        cout << countKdivPairs(array, n, x, y) << endl;
    }
    return 0;
}
