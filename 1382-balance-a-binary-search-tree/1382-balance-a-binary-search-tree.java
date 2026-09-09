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
    public void inorder(TreeNode root,ArrayList<Integer>al){
        if(root==null){
            return;
        }
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al); }

        public TreeNode bst(TreeNode root,ArrayList<Integer>al,int st,int end){
            if(st>end){
                return null;
            }
            int mid=st+(end-st)/2;
            TreeNode root1=new TreeNode(al.get(mid));
            root1.left=bst(root,al,st,mid-1);
            root1.right=bst(root,al,mid+1,end);
            return root1;

        }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>al=new ArrayList<>();
        inorder(root,al);
        TreeNode ans=bst(root,al,0,al.size()-1);
        return ans;

        
    }
}