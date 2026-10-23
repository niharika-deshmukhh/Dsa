class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<words.size();i++){
            String ans=words.get(i);
            s1.append(ans.charAt(0));
        }
        if(s.length()!=s1.length()){
            return false;
        }
        for(int j=0;j<s.length();j++){
            if(s1.charAt(j)!=s.charAt(j)){
                return false;
            }
        }return true;
        
    }
}