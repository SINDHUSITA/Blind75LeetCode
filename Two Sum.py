class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}
        for i in range(len(nums)):
            print(nums[1])
            if target - nums[i] in dic:
                return [dic[target - nums[i]], i]
            dic[nums[i]] = i

        return [-1,-1]
            
