class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]>=minK && nums[j]<=maxK){
                count=count+j-i+1;
                j++;
            }else{
                if(j+1<nums.length){
                    i=j+1;
                    j=j+1;
                }else{
                    break;
                }
            }
        }return count;
        
        
    }
}