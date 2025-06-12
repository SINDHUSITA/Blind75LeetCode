# Last updated: 6/12/2025, 8:30:03 AM
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        curr = root
        while curr:
            # if (p.val < curr.val and q.val > curr.val) or (p.val > curr.val and q.val < curr.val):
            #     return curr
            if p.val < curr.val and q.val < curr.val:
                curr = curr.left
            elif p.val > curr.val and q.val > curr.val:
                curr = curr.right
            # elif p.val == curr.val or q.val == curr.val:
            #     return curr
            else:
                return curr
        return root
                