class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = i;
        int temp = k;
        int length = 0;
        int max = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                temp--;
            }
            if (temp < 0) {
                while (nums[i] != 0) {
                    i++;
                }i++;
                temp++;
            }
            length = j - i + 1;
            max = Math.max(length, max);
            j++;

        }
        // length = j - i + 1;
        // max = Math.max(length, max);
        return max;

    }
}