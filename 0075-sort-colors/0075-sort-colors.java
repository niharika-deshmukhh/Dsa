class Solution {
    public void sortColors(int[] nums) {
       
        int p=0;
      for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[p];
                nums[p]=temp;
                p++;
            }
        }
          
      for(int j=0;j<nums.length;j++){
            if(nums[j]==1){
                int temp=nums[j];
                nums[j]=nums[p];
                nums[p]=temp;
                p++;
            }
        }
        }
    }
