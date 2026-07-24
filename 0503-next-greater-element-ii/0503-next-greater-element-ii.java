class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int nums2[]=new int[nums.length*2];
        int j=0;
        int k=0;
       while(k<nums2.length){
        nums2[k]=nums[j];
        k++;
        j=(j+1)%nums.length;

       }
       int ans[]=new int[nums.length];
       Arrays.fill(ans,-1);
       Stack<Integer>st=new Stack<>();
     
       for(int i=nums2.length-1;i>=0;i--){
        if(!st.isEmpty()&& st.peek()<=nums2[i]){
            while(!st.isEmpty()&& st.peek()<=nums2[i]){
                st.pop();
            }
            
        }
         if(!st.isEmpty()&& st.peek()>nums2[i]){
            if (i < nums.length) {
                ans[i % nums.length] = st.peek();
}
           
          
        }
        st.push(nums2[i]);
       }      
       return ans;  
    }
}