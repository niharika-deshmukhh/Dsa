class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        if (pq.isEmpty()) {
            return 0;
        }

        int maxlength = 1;
        int length = 1;

        while (!pq.isEmpty()) {
            int num = pq.remove();

            if (!pq.isEmpty()) {
                if (num == pq.peek()) {
                    continue;
                }
                else if (num + 1 == pq.peek()) {
                    length++;
                }
                else {
                    length = 1;
                }

                maxlength = Math.max(maxlength, length);
            }
        }

        return maxlength;
    }
}