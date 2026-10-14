class Solution {
    public void setZeroes(int[][] matrix) {
        int i;int j;
        HashSet<Integer> rows = new HashSet();
HashSet<Integer> cols = new HashSet();
        for( i=0;i<matrix.length;i++){
            for( j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                   rows.add(i);
                   cols.add(j);
                }
            }
        }
       for(int l=0;l<matrix.length;l++){
            for(int m=0;m<matrix[l].length;m++){
            if (rows.contains(l) || cols.contains(m)){
                    matrix[l][m]=0;
                 } }
}
}
}