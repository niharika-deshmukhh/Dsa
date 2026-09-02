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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long>pq=new PriorityQueue<>(Comparator.reverseOrder());
      Queue<TreeNode>q=new LinkedList<>();
     
      q.add(root);
      while(!q.isEmpty()){
        int size=q.size();
        long sum=0;
        for(int i=0;i<size;i++){
        TreeNode curr=q.remove();
        sum=sum+curr.val;
        if(curr.left!=null){
            q.add(curr.left);
        }
        if(curr.right!=null){
            q.add(curr.right);
        }}
       pq.add(sum);


      }
      if(pq.size() < k){
    return -1;
}
     int count=1;
     while(count!=k){
        pq.remove();
        count++;
        
     }return pq.remove();

    }
}