// Last updated: 6/12/2025, 8:29:34 AM
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n%2 == 0) sb.append("a".repeat(n-1)).append("b");                  
        else sb.append("a".repeat(n));
        return sb.toString();
    }
}