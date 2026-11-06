class Solution {
    public int[] rearrangeArray(int[] nums) {
        int nums1[]=new int[nums.length];
        int p=0;
        int neg=0;
        int i=0;
       while(i<nums.length){
            if(nums[p]>=0 && nums[neg]<0){
                nums1[i]=nums[p];
                i++;
                nums1[i]=nums[neg];
                i++;
                p++;
                neg++;
            }
             if(p<nums.length && nums[p]<0){
                while(p<nums.length && nums[p]<0){
                    p++;
                }
            }
          if(neg<nums.length && nums[neg]>0){
            while(neg<nums.length && nums[neg]>0){
                    neg++;
                }

            }
            
        }
        return nums1;
    }
}