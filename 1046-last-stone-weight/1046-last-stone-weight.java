class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        
        PriorityQueue<Integer>pq=new PriorityQueue(Comparator.reverseOrder());
        for(int j=0;j<stones.length;j++){
            pq.add(stones[j]);
        }
        int last=-1;
        while(pq.size()>1){
           
            int y=pq.remove();
            int x=pq.remove();
            if(x!=y){
                y=y-x;
                pq.add(y);
 }
 
 

        }if(pq.isEmpty()){
            return 0;
        }else{
            return pq.peek();
        }
        
            }
}