class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                prefix[i]=0;
                product=1;
             }else{
            product=nums[i]*product;
            prefix[i]=product; }}
        product=1;
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==0){
                suffix[j]=0;
                product=1;
              }else{
            product=nums[j]*product;
            suffix[j]=product;} }
            int max=0;
        for(int k=0;k<prefix.length;k++){
            max=Math.max(prefix[k],max);

        }
        for(int l=0;l<suffix.length;l++){
            max=Math.max(suffix[l],max);
        }
        return max;

        
    }
}