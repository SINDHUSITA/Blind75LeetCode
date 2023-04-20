class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count = 0
        for i in nums:
            if not math.floor(log10(i) + 1) % 2:
                count+=1
        return count
                
            