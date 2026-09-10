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
    int length=0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
       int left=height(root.left);
       int right=height(root.right);
       return Math.max(left,right)+1;
    }
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        max=Math.max(left+right,max);
        int left1=diameterOfBinaryTree(root.left);
        int right1=diameterOfBinaryTree(root.right);

        return max;
        
    }
}