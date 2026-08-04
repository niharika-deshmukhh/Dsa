class Solution {
    public int secondHighest(String s) {
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        HashSet<Character>set=new HashSet();
        for(int i=0;i<s.length();i++){
            if('0'<=s.charAt(i)&&s.charAt(i)<='9'&& !set.contains(s.charAt(i))){
                pq.add(s.charAt(i) - '0');
                set.add(s.charAt(i));
            }
        }
        if(pq.size()<=1){
            return -1;
        }
        pq.remove();
        return pq.remove();
        
    }
}