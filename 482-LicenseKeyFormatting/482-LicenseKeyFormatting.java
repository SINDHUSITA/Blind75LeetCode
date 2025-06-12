// Last updated: 6/12/2025, 8:29:55 AM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-","");
        s = s.toUpperCase();
        int n = s.length();
        while(n>0){
            
            if(n-k> 0){
                s = s.substring(0,n-k)+ "-"+ s.substring(n-k,s.length());
            }
            
            n = n-k;
        }
        return s;
    }
}