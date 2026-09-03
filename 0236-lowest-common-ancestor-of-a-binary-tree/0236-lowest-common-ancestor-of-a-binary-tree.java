/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static Boolean path(TreeNode root, TreeNode N, ArrayList<TreeNode> al) {
        if (root == null) {
            return false;
        }
        al.add(root);
        if (root == N) {
            return true;
        }

        Boolean left = path(root.left, N, al);
        Boolean right = path(root.right, N, al);
        if(left||right){
            return true;
        }
        al.remove(al.size() - 1);
        return false;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        ArrayList<TreeNode> al = new ArrayList<>();
        ArrayList<TreeNode> al2 = new ArrayList<>();
        path(root, p, al);
        path(root, q, al2);
        int j = 0;
        int i = 0;

        while (i < al.size() && i < al2.size() && al.get(i) == al2.get(i)) {
            i++;
        }

        return al.get(i - 1);

    }
}