class Solution {
    public boolean isPalindrome(String sb) {
        // StringBuilder sb=new StringBuilder();
        // for(int k=0;k<s.length();k++){
        //     if(isLetterOrDigit(s.charAt(k))){
        //         sb.append(s.charAt(k));
        //     }
        
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(Character.isLetterOrDigit(sb.charAt(i))&&Character.isLetterOrDigit(sb.charAt(j))){
            if(Character.toLowerCase(sb.charAt(i))==Character.toLowerCase(sb.charAt(j))){
                i++;j--;
            }
            else{
                return false;

            }}else{
              if(!Character.isLetterOrDigit(sb.charAt(i))){
                i++;
              }else{
                j--;
              }
            }
        }
        return true;

        
    }
}