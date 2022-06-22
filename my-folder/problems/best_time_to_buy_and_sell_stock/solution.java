class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length - 1;
            int currMaxValue = prices[size];
            int maximumProfit = 0;
            for(int i = size-1; i >= 0; i-- ){
                 maximumProfit = Math.max(maximumProfit, currMaxValue - prices[i]);
                 currMaxValue = Math.max( prices[i], currMaxValue);
            }
            return maximumProfit;

    }
}