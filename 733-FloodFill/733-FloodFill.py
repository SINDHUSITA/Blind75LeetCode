# Last updated: 6/12/2025, 8:29:41 AM
class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        initCol = image[sr][sc]
        return self.fill(image, sr, sc, color, initCol)
    def fill(self, image: List[List[int]], sr: int, sc: int, color: int, initCol: int):
        if sr<0 or sc<0 or sr>len(image)-1 or sc>len(image[0])-1 or image[sr][sc] != initCol:
            return image
        if image[sr][sc] == color:
            return image
        image[sr][sc] = color
        image = self.fill(image, sr-1,sc, color, initCol)
        image = self.fill(image, sr,sc-1,  color, initCol)
        image = self.fill(image, sr,sc+1,  color, initCol)
        image = self.fill(image, sr+1,sc,  color, initCol)
        return image