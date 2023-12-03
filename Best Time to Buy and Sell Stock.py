class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        left = 0
        right = 1 if len(prices) > 1 else None
        if right == None:
            return 0
        while right < len(prices):
            curProfit = prices[right] - prices[left]
            if prices[left] < prices[right]:
                maxProfit = max(curProfit, maxProfit)
            else:
                left = right
            right += 1
        return maxProfit
