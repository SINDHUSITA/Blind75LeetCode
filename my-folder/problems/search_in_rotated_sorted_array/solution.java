class Solution {
    public int search(int[] nums, int target) {
        
        
        List<Integer> q = new ArrayList<>();
        int k=0;
        for(int i =0; i< nums.length; i++){
           
                q.add(nums[i]);
            
        }
        
    System.out.print(q);
        return q.indexOf(target);
    }
}