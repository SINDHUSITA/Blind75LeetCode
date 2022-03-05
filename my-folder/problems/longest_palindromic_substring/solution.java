class Solution {
    public String longestPalindrome(String s) {
        boolean mem[][] = new boolean[s.length()][s.length()];
        String output="";
        int max =0;
        for(int j=0;j<s.length();j++){
            for(int i=0;i<=j;i++){
                boolean isTrue = s.charAt(i) == s.charAt(j);
                boolean judge = j-i >2 ? mem[i+1][j-1] && isTrue:isTrue;
                mem[i][j] = judge;
                int cal = j-i+1;
                if(cal > max && judge){
                    max = cal;
                    output = s.substring(i,j+1);
                }
            }
        }
        return output;
    }
}