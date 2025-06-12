# Last updated: 6/12/2025, 8:30:39 AM
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        return bin(int(a,2)+int(b,2))[2:]
        