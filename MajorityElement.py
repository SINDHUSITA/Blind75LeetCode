class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # s = [i for i in set(nums) if nums.count(i) > len(nums)/2]
        # return s[0]
        
        count = 0
        res = None
        for num in nums:
            if count == 0:
                res = num
            count += (1 if num == res else -1)
        return res
        
