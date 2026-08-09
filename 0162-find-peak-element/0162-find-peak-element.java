class Solution {
    public int findPeakElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<nums.length;i++){
            
                map.put(nums[i],i);
            }
        int max=Integer.MIN_VALUE;
        for(int k=0;k<nums.length;k++){
            max=Math.max(nums[k],max);
        }
        return map.get(max);

        
    }
}