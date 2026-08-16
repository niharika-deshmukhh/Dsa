class Solution {
    public class Sort implements Comparable<Sort>{
       int freq;
       char order;
      Sort(int freq,char order){
        this.freq=freq;
        this.order=order;
      }
      @Override
      public int compareTo(Sort s2){
        if(this.freq!=s2.freq){
          return s2.freq-this.freq;}
          else{
            return this.order-s2.order;
          }
      }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Sort>pq=new PriorityQueue();
       for(char ch:map.keySet()){
            pq.add(new Sort(map.get(ch),ch));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Sort curr=pq.remove();
             for (int i = 0; i < curr.freq; i++) {
                sb.append(curr.order);
            }
        }
        return sb.toString();

        



        
    }
}