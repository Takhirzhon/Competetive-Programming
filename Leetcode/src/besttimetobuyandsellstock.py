class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left = 0
        right = 1
        maxProf = 0
        while right < len(prices):
            buy = prices[left]
            sell = prices[right]
            if buy < sell :
                maxProf = max(maxProf, sell - buy)
            else:
                left = right
            right+=1
        return maxProf
    