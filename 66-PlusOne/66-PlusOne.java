// Last updated: 6/12/2025, 8:30:40 AM
class Solution {
    
        
    public int[] plusOne(int[] digits) {
       int n = digits.length;
        for(int i = n-1; i>=0; i--){
           if(digits[i]==9)
               digits[i]=0;
            else{
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }
}