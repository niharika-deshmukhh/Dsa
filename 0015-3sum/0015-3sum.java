class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>alfinal=new ArrayList();
        List<Integer>al=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    alfinal.add(new ArrayList(al));
                    al.clear();
                    j++;
                    if(nums[j]==nums[j-1]){
                    while(j<k && nums[j]==nums[j-1]){
                    j++;
                }
                }
                
   
                
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else{
                    
               
                    j++;
                }
          
            
        }
        
    }

return alfinal;}}