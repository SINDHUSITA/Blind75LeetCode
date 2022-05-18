class Solution {
    
    public int search(int[] nums, int target) {
        
        int s_index = 0, l_index = nums.length - 1, m_index;
        
        //return binarySearch( nums, s_index, l_index, target);

        if(target < nums[0] || target > nums[l_index]){
           return -1;
        }
        
        while( s_index <= l_index){
            m_index = s_index + (l_index - s_index) / 2;
            if(target == nums[m_index]){
                return m_index;
            }else if(target < nums[m_index]){
                l_index = m_index-1;
            }else{
                s_index = m_index+1;
            }
            
        }
        return -1;
    }
    
    int binarySearch(int[] nums,int s_index,int l_index,int target){
        if(s_index <= l_index){
            int m = s_index + (l_index - s_index) / 2;
            
            if(target == nums[m]){
                return m;
            }
            
            if(target > nums[m]){
                return binarySearch(nums, m + 1, l_index, target);
            }
            
            return binarySearch(nums, s_index, m-1, target);
        } 
        return -1;
    }
}