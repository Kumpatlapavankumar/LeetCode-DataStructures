class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }

        int subsetSum = (sum + target) / 2;
        int[][] t = new int[n + 1][subsetSum + 1];

        for (int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }

        for (int j = 1; j <= subsetSum; j++) {
            t[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= subsetSum; j++) {
                if (nums[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j - nums[i - 1]] + t[i - 1][j];
                }
            }
        }

        return t[n][subsetSum];
    }
}
