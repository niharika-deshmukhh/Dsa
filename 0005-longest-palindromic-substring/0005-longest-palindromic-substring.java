class Solution {
    public String longestPalindrome(String s) {
        int length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    int start=i;
                    int end=j;
                    while(start<=end){
                        if(s.charAt(start)==s.charAt(end)){
                           start++;end--;
                        }else{
                            break;
                        }
                    }
                    if(start>=end){
                        length=j-i+1;
                        if(length>sb.length()){
                            sb.setLength(0);
                       sb.append(s.substring(i, j + 1));}
                    }
                }
            }
        }return sb.toString();
        
    }
}