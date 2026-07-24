class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        int j=1;
        for(int i=0;i<nums.length;i++){
         j=(i+1)%nums.length;
          if(nums[i]>=nums[j]){
                while(i!=j){
                    if(nums[i]<nums[j]){
                    ans[i]=nums[j];
                    break;
                    }
                    j=(j+1)%nums.length;
                }

            }else{
                ans[i]=nums[j];
                 j=(j+1)%nums.length;

            } 

        }return ans;
        
    }
}