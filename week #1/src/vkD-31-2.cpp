#include <iostream>
#include <vector>

using namespace std;

int main(){
    int caseNum;
    cin >> caseNum;
    vector<int> arr;
    int num;
    while(caseNum--){
        cin >> num;
        arr.push_back(num);
    }
    int count = 0;

    for (auto it= arr.begin(); it != arr.end();){
        if (*it == 0) {
            it = arr.erase(it);
            count++;
        }
        else {
            it++;
        }
    }
    for (int i = 0; i < count; i++){
        arr.push_back(0);
    }

    for (auto it = arr.begin(); it != arr.end(); it++){
        cout << *it << " ";
    }
}