class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        s = [i for i in set(nums) if nums.count(i) > len(nums)/2]
        return s[0]
        
