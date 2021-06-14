class Solution {
    public boolean isPalindrome(int x) {
        int duplicate = x;
        int temp,n = 0;
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        else{
            while (x!=0){
                temp= x%10;
                x = x/10;
                n = n*10 +temp;
            }
            if(duplicate == n){
                return true;
            }
            return false;
                
        }
        
    }
}