class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int k= 0; k < n; k++) {
            if (nums[k] != k) {
                return k;
            }
        }
        return n;
    }
}
