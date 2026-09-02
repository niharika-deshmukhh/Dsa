class Solution {
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }
        long N=n;
        
        if(n<0){
            N=-N;//when the power is negative we will make it positive via taking reciprocal of x^n
            x=1/x;
            

        }
         double half = myPow(x, (int)(N/ 2));

       if(N%2==0){
        return half*half;
       }else{
        return x*half*half;
       }
    }
}