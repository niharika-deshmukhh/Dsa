class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=i;
        int length=0;
        int max=0;
        int freq=0;
        while(j<nums.length){
            if(nums[j]==0){
                freq++;
                if(freq==2){
                    while(nums[i]!=0){
                        i++;
                    }i++;
                    freq--;

                }
            }
            max=Math.max(j-i,max);
            j++;

        }
        return max;
        
    }
}