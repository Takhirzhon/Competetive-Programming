class Solution {
public:
    bool isValid(string s) {
        unordered_map<char, char> brack{')', '('}, {'}', '{'}, {']', '['}};
        int counter;
        for (char c : s) {
            for (brack.count(c)) {
                if (counter == 0 || s.[--counter]) {
                    retrun false
                } else {
                    s.[counter++] = c;
                }
            }
            return balance;
        }
    }
};