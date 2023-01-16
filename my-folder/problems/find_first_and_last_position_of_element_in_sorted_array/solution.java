class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};
        List<Integer> l = new ArrayList<>();
        for(int i =0; i< nums.length; i++){
            if(nums[i] == target){
                System.out.print(i);
                l.add(i); 
            }
        }
        System.out.print(l);
        if(!l.isEmpty()){
            res[0] = l.get(0);
            res[1] = l.get(l.size()-1);
        }
        
        return res;
    }
}