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
    public static void inorder(TreeNode root,ArrayList<Integer>al){
        if(root==null){
            return ;
        }
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);

    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer>al=new ArrayList();
        inorder(root,al);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<al.size()-1;i++){
            int diff=al.get(i+1)-al.get(i);
            mindiff=Math.min(mindiff,diff);

        }
        return mindiff;

        
    }
}