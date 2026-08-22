class Solution {
    public String reverseWords(String s) {
       s= s.trim();
       StringBuilder sb=new StringBuilder();
       int prevsub=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            int sub=i;
            sb.insert(0,s.substring(prevsub,sub));
            sb.insert(0,' ');
            while(s.charAt(i)==' '){
                i++;
            }
             i--;
          
            prevsub=i+1; 
            
       





        }
     
        
       }
        sb.insert(0,s.substring(prevsub));

       

       return sb.toString();


        
    }
}