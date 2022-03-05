class Solution {
    public int coinChange(int[] coins, int amount) {
        return getCoins(coins,amount,new int[amount]);
    }
    public int getCoins(int[] coins,int amount,int[] mem){
        if(amount < 0)
            return -1;
        if(amount == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        if(mem[amount-1]!=0) return mem[amount-1];
        for(int coin:coins){
            if(amount-coin >=0){
                int num = getCoins(coins,amount-coin,mem);
                if(num>=0 && num<min){
                    min = 1+num;
                }
            }
        }
        
        mem[amount-1] = (min == Integer.MAX_VALUE ) ?-1:min;
        return mem[amount-1];
    }
}