class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        for num in nums:
            if num not in freq:
                freq[num] = 0
            freq[num] +=1

        sorted_keys = sorted(freq.keys(), key=lambda x: freq[x], reverse=True)
        return sorted_keys[:k]