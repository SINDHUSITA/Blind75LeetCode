class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return checkWord(s,new HashSet<>(wordDict),0,new Boolean[s.length()]);
    }
    public boolean checkWord(String word,HashSet<String> wordDict,int start,Boolean[] dp){
        if(start == word.length())
            return true;
        if(dp[start] != null )return dp[start];
        for(int end = start;end<word.length();end++){
            String tempString = word.substring(start,end+1);
            if(wordDict.contains(tempString) && checkWord(word,wordDict,end+1,dp)){
                dp[start] = true;
                return true;
            }
        }
        dp[start] = false;
        return false;
    }
}