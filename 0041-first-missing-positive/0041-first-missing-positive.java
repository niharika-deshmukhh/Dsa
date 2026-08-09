class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet();
        for(int j=0;j<nums.length;j++){
            set.add(nums[j]);
        }
        int i=1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;

        }
    }
}