# Last updated: 6/12/2025, 8:29:52 AM
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_so_far = -1
        count= 0
        start, end = 0,0
        print(len(nums))
        while end < len(nums):
            print(start, end, count)
            count+=nums[end]
            if count > max_so_far:
                max_so_far = count
            if nums[end] == 1:
                end += 1
                # count+=1
            else:
                start, end = end+1, end+1
                count = 0
        print("max_so_far",max_so_far)
        return(max_so_far)
                