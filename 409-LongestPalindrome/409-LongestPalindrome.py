# Last updated: 6/12/2025, 8:29:53 AM
class Solution:
    def longestPalindrome(self, s: str) -> int:
        from collections import Counter
        char_count = Counter(s)
        oddCount = [1 for k,v in char_count.items() if v%2 == 1]
        if oddCount:
            return len(s)-len(oddCount)+1
        return len(s)