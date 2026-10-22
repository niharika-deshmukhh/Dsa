class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> a = new ArrayList();
        List<Integer> al = new ArrayList();

        Arrays.sort(nums);
        int i = 0;

        while (i < nums.length - 3) {

            int j = i + 1;
            while (j < nums.length - 2) {
                int k = j + 1;
                int m = nums.length - 1;
                while (k < m) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[m];
                    if (sum == target) {
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        al.add(nums[m]);
                        a.add(new ArrayList<>(al));
                        al.clear();
                        k++;
                        m--;
                        while (k < m && nums[k] == nums[k - 1]) {
                            k++;
                        }

                        while (k < m && nums[m] == nums[m + 1]) {
                            m--;
                        }
                    } else if (sum > target) {
                        m--;

                    } else {
                        k++;
                    }

                }
                while (j < nums.length - 2 && nums[j] == nums[j + 1]) {
                    j++;
                }
                j++;

            }
            while (i < nums.length - 3 && nums[i] == nums[i + 1]) {
                i++;
            }
            i++;
        }
        return a;
    }
}