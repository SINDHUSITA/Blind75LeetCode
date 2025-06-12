// Last updated: 6/12/2025, 8:29:54 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int count;
    public int diameterOfBinaryTree(TreeNode root) {
        count =0;
        longest(root);
        return count;
    }
    
    public static int longest(TreeNode root){
        if(root == null){return 0;}
        int l = longest(root.left);
        int r = longest(root.right);
        
        count = Math.max(l+r,count);
        return Math.max(l,r)+1;
    }
}