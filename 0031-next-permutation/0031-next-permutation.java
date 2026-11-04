class Solution {
    public static void rev(int arr[],int st,int end){
        while(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int count=0;
        int j=nums.length-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                while(j>=0 && nums[j]<=nums[i-1]){
                    j--;
                }
              
                int temp=nums[i-1];
                nums[i-1]=nums[j];
                nums[j]=temp;
                count++;
                rev(nums,i,nums.length-1);
                break;
            }
        }
        if(count==0){
            Arrays.sort(nums);
        }
        
        
    }
}