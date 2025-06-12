// Last updated: 6/12/2025, 8:30:20 AM
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
    public static List<Integer> num; 
    public List<Integer> preorderTraversal(TreeNode root) {
        num = new ArrayList<>();
        helper(root);
       return num;
    }
    public static void helper(TreeNode root){
        if(root!=null){
            num.add(root.val);
            if(root.left != null)
                helper(root.left);
            if(root.right!=null)
                helper(root.right);
        }
        
    }
}