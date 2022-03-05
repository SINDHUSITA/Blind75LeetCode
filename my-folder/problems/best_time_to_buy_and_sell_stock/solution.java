class Solution {
    public int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;
        int max =0;
        int maxProfit = 0;
        boolean flag = false;
        for(int i=0;i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
                max = prices[i];
            }else{
                max = max<prices[i]?prices[i]:max;
                int diff = max-min;
                maxProfit = maxProfit<diff ? diff:maxProfit;
            }
        }
        return maxProfit;
    }
}