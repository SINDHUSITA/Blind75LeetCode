class Solution {
    public int newInteger(int n) {
        System.out.print(Integer.toString(n, 1));
        return Integer.parseInt(Integer.toString(n, 9));
    }
}