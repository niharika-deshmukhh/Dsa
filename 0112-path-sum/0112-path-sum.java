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
    public Boolean sum(TreeNode root,int sum,int targetSum){
        if(root==null){
            return false;
        }
        sum=sum+root.val;
        
        if(sum == targetSum && root.left == null && root.right == null){
            return true;
        }
        Boolean leftsum=sum(root.left,sum,targetSum);
    Boolean rightsum=sum(root.right,sum,targetSum);
        sum=sum-root.val;
        return leftsum||rightsum;
    
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
       return sum(root,sum,targetSum);
        
     
        
    }
}