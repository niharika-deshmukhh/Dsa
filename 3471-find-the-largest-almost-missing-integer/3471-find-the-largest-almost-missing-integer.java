class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int max = -1;

        if (k == n) {
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }

        if (k == 1) {
            for (int num : nums) {
                if (counts.get(num) == 1) {
                    max = Math.max(max, num);
                }
            }
            return max;
        }
        if (counts.get(nums[0]) == 1) {
            max = Math.max(max, nums[0]);
        }
        if (counts.get(nums[n - 1]) == 1) {
            max = Math.max(max, nums[n - 1]);
        }
        return max;
    }
}