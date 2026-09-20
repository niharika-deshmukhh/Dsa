class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int idx=(int)s.charAt(i)-'a';
            int rev=26-idx;
            sum=sum+rev*(i+1);
        }return sum;
        
    }
}