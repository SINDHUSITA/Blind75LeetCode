// Last updated: 6/12/2025, 8:29:39 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
        return false;
    }
    String conString = s + s;
    return conString.contains(goal);
        
    }
}