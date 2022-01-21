class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        indices = dict()
        previous = [-1 for char in s]
        for i, char in enumerate(s):
            if char in indices:
                previous[i] = indices[char]
            indices[char] = i
        best = [1 for char in s]
        ans = 1
        for i, char in enumerate(s):
            if i == 0:
                continue
            curr_index = i-best[i-1]
            new_index = previous[i]
            if new_index < curr_index:
                best[i] = best[i-1]+1
            else:
                best[i] = i-previous[i]
            ans = max(ans, best[i])
        return ans