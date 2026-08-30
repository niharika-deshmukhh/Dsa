class Solution {
    public int minimumDeletions(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int min = 0;
        int max = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > nums[max]) {
                max = j;//1
            }
            if (nums[j] < nums[min]) {
                min = j;//5
            }
        }
        int mincount = Integer.MAX_VALUE;
        int count = 0;
        count = Math.min(min, max) + 1 + nums.length - Math.max(min, max);

        mincount = Math.min(count, mincount);
        count = 0;
        //front
        if (max > min) {
            count = max + 1;
        } else {
            count = min + 1;
        }
        mincount = Math.min(count, mincount);
        count = 0;
        //end
        if (max > min) {
            count = nums.length - min;
        } else {
            count = nums.length - max;
        }
        mincount = Math.min(count, mincount);
        return mincount;

    }
}