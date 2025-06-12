# Last updated: 6/12/2025, 8:29:58 AM
class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        def helper(left, right, s):
            if left >= right:
                return
            s[left], s[right] = s[right], s[left]
            left, right = left+1, right-1
            helper(left, right, s)
        helper(left=0, right=len(s)-1, s=s)
        