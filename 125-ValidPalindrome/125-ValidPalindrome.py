# Last updated: 6/12/2025, 8:30:26 AM
class Solution:
    def isPalindrome(self, s: str) -> bool:
        import re
        s = re.sub(r'[^a-zA-Z0-9]', '', s).lower()
        print(s)
        left = 0
        right = len(s)-1
        # print(s, s[::-1])
        # return s == s[::-1]
        while left < right:
            if s[left] == s[right]:
                left+=1
                right-=1
            else:
                return False
        return True