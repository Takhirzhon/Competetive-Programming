class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        minEl = 1
        maxEl = 1

        for n in nums:
           tmp = maxEl * n
            
           maxEl = max(maxEl * n, n * minEl, n)
           minEl = min(tmp, n * minEl, n)

           res = max(maxEl, res)
        return res