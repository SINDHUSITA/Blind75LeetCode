# Last updated: 6/12/2025, 8:30:09 AM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # return len(set(nums)) != len(nums)
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i] == nums[i+1]:
                return True
        return False
