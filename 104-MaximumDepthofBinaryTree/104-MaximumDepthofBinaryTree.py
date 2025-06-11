# Last updated: 6/11/2025, 8:58:20 AM
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        self.max_depth = 0
        return self.depth_of_tree(root)
    def depth_of_tree(self, node):
        if not node:
            return 0
        l = self.depth_of_tree(node.left)
        r = self.depth_of_tree(node.right)
        curr_depth = max(l,r) + 1
        self.max_depth = max(curr_depth, self.max_depth)
        return curr_depth

