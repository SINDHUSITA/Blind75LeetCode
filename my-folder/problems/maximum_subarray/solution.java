class Solution {
    public int maxSubArray(int[] nums) {
        int currentArray = nums[0];
        int maxArray = nums[0];
        for(int i=1;i<nums.length;i++){
            int num = nums[i];
            currentArray = Math.max(num,currentArray+num);
            maxArray = Math.max(currentArray,maxArray);
        }
        return maxArray;
    }
}