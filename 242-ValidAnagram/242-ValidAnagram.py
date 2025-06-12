# Last updated: 6/12/2025, 8:30:10 AM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # return sorted(s) == sorted(t)
        sCounts = {}
        tCounts = {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            sCounts[s[i]] = sCounts.get(s[i], 0) + 1
            tCounts[t[i]] = tCounts.get(t[i], 0) + 1
        if len(sCounts) != len(tCounts):
            return False
        for c in sCounts.keys():
            if tCounts.get(c) != sCounts[c]:
                return False
        return True