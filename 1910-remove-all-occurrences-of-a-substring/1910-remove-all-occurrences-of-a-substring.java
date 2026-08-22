class Solution {
    public String removeOccurrences(String s, String part) {
        if(s.isEmpty()){
            return " ";
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<s.length();j++){
            sb.append(s.charAt(j));

        }
        int length=part.length();
        for(int i=0;i<s.length();i++){
            int index=sb.indexOf(part);
            if(index==-1){
                break;
            }
            sb.delete(index,index+length);
            
        }return sb.toString();
        
    }
}