class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1||nums.length==1){
            return;
        }
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      int j=0;
            while(map.containsKey(0)&&map.get(0)!=0){
                nums[j]=0;
                map.put(0,map.get(0)-1);
                j++;
            }
             while(map.containsKey(1)&&map.get(1)!=0){
                nums[j]=1;
                map.put(1,map.get(1)-1);
                j++;
            }
             while(map.containsKey(2)&&map.get(2)!=0){
                nums[j]=2;
                map.put(2,map.get(2)-1);
                j++;
            }
            if(j==nums.length-1){
              return;
            }
        }

        
    
}