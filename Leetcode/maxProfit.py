class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left = 0
        right = 1
        maxProfit = 0
        while right < len(prices):
            buy = prices[left]
            sell = prices[right]
            if buy < sell:
                maxProfit = max(maxProfit, sell - buy)
            else:
                left = right
            right += 1
        return maxProfit
            

            