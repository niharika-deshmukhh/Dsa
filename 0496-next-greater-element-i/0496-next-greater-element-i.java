class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        int ans[]=new int[nums1.length];
        Arrays.fill(ans, -1);
        int next[]=new int[nums2.length];
        Arrays.fill(next,-1);
        Stack<Integer>st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
           
            while(!st.isEmpty()&& st.peek()<nums2[i]){
                st.pop();
            }
            if(!st.isEmpty()&& st.peek()>nums2[i]){
                next[i]=st.peek();
            }
             st.push(nums2[i]);

        }
        for(int j=0;j<ans.length;j++){
            int index=map.get(nums1[j]);
            ans[j]=next[index];

        }
        return ans;

        
    }
}