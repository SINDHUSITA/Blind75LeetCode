class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #solution 1 - generate n(n+1)/2 subarrays and get max
        max_sum = nums[0]
        curr = nums[0]
        for i in nums[1:]:
            curr = max(i, curr + i)
            max_sum = max(max_sum, curr)
        return max_sum
