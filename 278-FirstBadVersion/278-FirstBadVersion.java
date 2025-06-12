// Last updated: 6/12/2025, 8:30:05 AM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int st = 0, en = n, m;
        
        while(st <= en){
            m = st + (en - st) / 2;
            if(isBadVersion(m) && !isBadVersion(m-1)) return m;
            if(isBadVersion(m)) en = m - 1;
            else st = m + 1;
        }
        return 1;
    }
}