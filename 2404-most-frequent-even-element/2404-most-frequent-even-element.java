class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int max=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==0){
                max=Math.max(map.get(nums[j]),max);
            }
        }
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0 && map.get(nums[k])==max){
                return nums[k];
            }
        }
        return -1;
        
    }
}