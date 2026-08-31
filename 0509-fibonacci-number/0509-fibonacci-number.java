class Solution {
    public int fib(int n) {
        if(n==0||n==1){
            return n;
        }
      int sol=fib(n-2)+fib(n-1);
      return sol;
        
    }
}