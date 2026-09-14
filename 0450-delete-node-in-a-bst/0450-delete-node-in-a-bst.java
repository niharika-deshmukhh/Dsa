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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
      if(root.val>key){
        root.left=deleteNode(root.left,key);
      }
      if(root.val<key){
        root.right=deleteNode(root.right,key);
      }
      if(root.val==key){
        if(root.left==null && root.right==null){
            return null;
        }
        if(root.left!=null && root.right!=null){
           TreeNode temp = root.right;

                while (temp.left != null) {
                    temp = temp.left;
                }
//Exactly — the left subtree has smaller values. But for deletion when a node has two children, we need a replacement value that is larger than the current root but as small as possible.
                root.val = temp.val;
                root.right = deleteNode(root.right, temp.val);//we have picked the smallest value from right subtree
        }
       else if(root.left!=null){
            return root.left;
        }
       else if(root.right!=null){
            return root.right;
        }
      }return root;
    }
}