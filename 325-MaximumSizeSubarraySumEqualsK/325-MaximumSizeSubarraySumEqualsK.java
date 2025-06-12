// Last updated: 6/12/2025, 8:29:59 AM
class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        List<Integer> prices = new ArrayList();
        int money = k;
        
        for(int i=0; i<nums.length; i++) {
            prices.add(nums[i]);
        }
        
        int[] sum = new int[prices.size() + 1];
        Map<Integer, Integer> map = new HashMap<>(prices.size() + 1);
        map.put(0, 0);
        for(int i = 1; i <= prices.size(); i++) {
            sum[i] = sum[i-1] + prices.get(i-1);
            map.put(sum[i], i);
        }
        int len = 0;
        for(int i = 0; i < prices.size(); i++) {
            Integer l = map.get(money + sum[i]);
            if(l != null && l - i > len) {
                len = l - i;
            }
        }
        return len;
    }
}