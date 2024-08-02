class Solution {
    public int minSwaps(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
            }
        }
        int cur = 0;
        for (int i = 0; i < c; i++) {
            if (nums[i] == 1) {
                cur++;
            }
        }

        int res = c - cur;
        int last = 0;
        for (int i = c; i < nums.length + c - 1; i++) {
            int ind = i;
            if (i >= nums.length) {
                ind = i % nums.length;
            }

            cur = cur - nums[last] + nums[ind];

            res = Math.min(res, c - cur);
            last++;

        }
        return res;
    }
}