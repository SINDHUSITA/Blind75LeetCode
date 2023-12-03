# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        return self.height(root)[0]
    def height(self, node: TreeNode):
        if not node:
            return True, 0
        leftBal, leftHeight = self.height(node.left)
        rightBal, rightHeight = self.height(node.right)
        balance = leftBal and rightBal and abs(leftHeight - rightHeight) <= 1
        return balance, max(leftHeight, rightHeight) + 1
