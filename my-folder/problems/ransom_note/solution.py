class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        from collections import Counter
        # Solution 1:
        # return not bool(Counter(ransomNote) - Counter(magazine))

        # Solution 2:
        if len(ransomNote) > len(magazine):
          return False
        magazine_counts = Counter(magazine)
        ransom_note_counts = Counter(ransomNote)
        for char, count in ransom_note_counts.items():
          magazine_count = magazine_counts[char]
          if magazine_count < count:
              return False
        return True