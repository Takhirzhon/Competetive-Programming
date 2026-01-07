class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 1:
            return nums[0]


        rob1, rob2 = 0, 0
        for i in range(n - 1):
            temp = max(rob1 + nums[i], rob2)
            rob1 = rob2
            rob2 = temp
        case1 = rob2

        rob1, rob2 = 0, 0
        for i in range(1, n):
            temp = max(rob1 + nums[i], rob2)
            rob1 = rob2
            rob2 = temp
        case2 = rob2

        return max(case1, case2)

 