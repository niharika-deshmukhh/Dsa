class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer>pq=new PriorityQueue();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                pq.add(matrix[i][j]);
            }
        }
        for(int n=1;n<k;n++){
            pq.remove();
        }
        return pq.remove();
        
    }
}