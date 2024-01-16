#include <bits/stdc++.h>

using namespace std;

int main() {
    int test;
    int participants;

    cin >> test;

    while (test--) {
        cin >> participants;

        vector<int> numWords(participants);
        vector<int> quality(participants);

        for (int i = 0; i < participants; i++) {
            cin >> numWords[i];
        }

        for (int i = 0; i < participants; i++) {
            cin >> quality[i];
        }

        int maxQualityParticipant = -1;
        int maxQuality = -1;

        for (int i = 0; i < participants; i++) {
            if (numWords[i] <= 10 && quality[i] > maxQuality) {
                maxQuality = quality[i];
                maxQualityParticipant = i + 1;
            }
        }
        cout << maxQualityParticipant << endl;
    }
    return 0;
}
