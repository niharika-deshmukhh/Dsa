class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        int max=0;
        for(int key:map.keySet()){
            if(max<map.get(key)){
            max=map.get(key);
            count=map.get(key);
        }
        else if(map.get(key)==max){
            count=count+map.get(key);
        }
        
    }
    return count;
}}