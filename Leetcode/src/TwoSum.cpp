class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {

        vector<int> sumOf(nums.size());

        for (int i = 0; i < nums.size(); i++)
            for (int j = i + 1; j <= nums.size(); j++) {
                if (nums[i] + nums[j] == target) {
                    sumOf.push_back(i);
                    sumOf.push_back(j);
                    return sumOf;
                }
            }
        return sumOf;
    }
};