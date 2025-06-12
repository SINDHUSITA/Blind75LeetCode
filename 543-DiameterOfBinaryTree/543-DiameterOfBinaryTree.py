# Last updated: 6/12/2025, 8:29:51 AM
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.max_height = 0
        self.depth_of_tree(root)
        return self.max_height
    def depth_of_tree(self, new_root):
            if new_root == None:
                return 0
            else:
                l = self.depth_of_tree(new_root.left)
                r = self.depth_of_tree(new_root.right)
                curr_height = l+r
                self.max_height = max(self.max_height, curr_height)
                print(self.max_height, curr_height)
                return max(l,r) + 1
