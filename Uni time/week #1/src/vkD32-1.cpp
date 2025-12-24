#include <iostream>
#include <vector>

using namespace std;

void insertion_sort(vector<int> &arr, int length) {
    for (int i = 1; i < length; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}


int main() {

    int length;
    cin >> length;;
    vector<int> arr;
    while (length--) {
        int num;
        std::cin >> num;
        arr.emplace_back(num);
    }

    insertion_sort(arr, arr.size());

    for (int & it : arr) {
        cout << it << " ";
    }

}