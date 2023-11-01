class Solution:
    def isValid(self, s: str) -> bool:
        d = {
        "{":"}",
        "[":"]",
        "(":")"
        }
        stack = []
        for b in s:
            if b in d:
                stack.append(b)
            elif stack and b == d[stack[-1]]:
                stack.pop()
            else:
                return False
        return stack == []