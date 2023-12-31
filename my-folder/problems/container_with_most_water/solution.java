public class Solution {
    public int maxArea(int[] height) {
        int result =0;
        int left = 0;
        int right = height.length -1;
        while(left< right){
            result = Math.max(result, ((Math.min(height[left], height[right]))*(right-left)));
            if(height[left]>= height[right]){
                right = right -1;
            }else{
                left++;
            }
        }
        return result;
    }
}