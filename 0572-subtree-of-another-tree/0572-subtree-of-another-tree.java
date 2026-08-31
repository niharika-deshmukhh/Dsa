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
    public boolean issame(TreeNode node,TreeNode subroot){
        if(node==null&&subroot==null){
            return true;
        }
        else if(node==null||subroot==null||node.val!=subroot.val){
            return false;
        }
        // boolean left=issame(node.left,subroot.left);
        // boolean right=issame(node.right,subroot.right);
        return issame(node.left,subroot.left) && issame(node.right,subroot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root==null||subroot==null){
            return false;
        }
        if(root.val==subroot.val){
            if(issame(root,subroot)){
                return true;
            }
        }
        // boolean left=isSubtree(root.left,subroot);
        // boolean right=isSubtree(root.right,subroot);
        return isSubtree(root.left,subroot) ||isSubtree(root.right,subroot);
        
    }
}