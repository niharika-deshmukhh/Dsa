class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            maxreach=Math.max(maxreach,i+nums[i]);
            if(maxreach<=i && i!=nums.length-1){
                return false;
            }
        }
        return true;
        
    }
}