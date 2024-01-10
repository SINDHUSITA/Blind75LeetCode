class Solution:
    def climbStairs(self, n: int) -> int:
        from math import comb
        current = n-1
        count = 1
        for i in range(1, n//2 + 1):
            count += comb(current, i)
            current -= 1
        return count



        