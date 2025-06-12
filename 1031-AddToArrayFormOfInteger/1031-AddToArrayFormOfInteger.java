// Last updated: 6/12/2025, 8:29:29 AM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
       int i = num.length - 1;
    List<Integer> result = new ArrayList<>();

    while (i >= 0 || k > 0) {
        if (i >= 0) {
            k += num[i];
            i--;
        }
        result.add(0, k % 10);  // insert at front to maintain order
        k /= 10;
    }

    return result;
    }
}