class Solution {
    public int maxRepeating(String sequence, String word) {
        HashMap<String,Integer>map=new HashMap();
        boolean ans=false;
        int count=0;
        if(sequence.contains(word)){
            ans=true;
            count=1;
        }
         String temp=word;
        while(ans==true){
            temp=temp+word;
            if(!sequence.contains(temp)){
            ans=false;
        }else{
            count++;
        }
        }return count;
        
    }
}