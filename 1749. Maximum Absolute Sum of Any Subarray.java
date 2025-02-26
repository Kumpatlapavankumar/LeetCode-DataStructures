class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxVal = 0, minVal = 0;
        int prev = 0;
        for(int i=0; i<nums.length; i++) {
            nums[i] += prev;
            maxVal = Math.max(maxVal, nums[i]);
            minVal = Math.min(minVal, nums[i]);
            prev = nums[i];
        }
        return maxVal - minVal;
    }
}
