class Solution {
    public int uniqueLetterString(String s) {
        int res = 0;
        // last two indexes
        int[][] index = new int[26][2];
        
        for(int i = 0; i < 26; i++){
            index[i] = new int[]{-1, -1};
        }
        
        int n = s.length();
        for(int i = 0; i < n; i++){
            int[] prevIndex = index[s.charAt(i) - 'A'];
            res += (prevIndex[1] - prevIndex[0]) * (i - prevIndex[1]);   
            
            prevIndex[0] = prevIndex[1];
            prevIndex[1] = i;
        }
        
        for(int[] prevIndex: index){
            res += (prevIndex[1] - prevIndex[0]) * (n - prevIndex[1]);
        }
        
        return res;
    }
}