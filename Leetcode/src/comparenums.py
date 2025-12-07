
#This code below is O(n^2)
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] == nums[j]:
                    return True
        return False

#Better approach where O(N)
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = {}
        for n in nums:
            if n in seen:
                return True
            seen[n] = True
        return False