class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer>al=new ArrayList();
         int srow=0;
         int erow=matrix.length-1;
         int scol=0;
         int ecol=matrix[0].length-1;
       while(srow <= erow && scol <=ecol){
        //top
         for(int i=scol;i<=ecol;i++){
            al.add(matrix[srow][i]);
         }
         //LEFT
 
         for(int j=srow+1;j<=erow;j++){
             al.add(matrix[j][ecol]);
         }
 //BOTTOM
         for(int k=ecol-1;k>=scol;k--){
            if(srow==erow){
                break;
            }
             al.add(matrix[erow][k]);
         }
         //right
         for(int l=erow-1;l>srow;l--){
            if(scol==ecol){
                break;
            }
             al.add(matrix[l][scol]);
         }
                srow++;        ecol--;
                erow--;scol++;
                }
         
         return al;

        
    }
}