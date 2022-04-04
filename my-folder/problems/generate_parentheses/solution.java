class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a = new ArrayList();
        if(n==0)
            a.add("");
        else
            for(int i =0; i<n;i++)
                for(String left: generateParenthesis(i))
                    for(String right: generateParenthesis(n-1-i))
                        a.add("(" + left + ")" + right);
      return a;  
    }
}