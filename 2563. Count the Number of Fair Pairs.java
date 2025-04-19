class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        // Sort the array to apply binary search
        Arrays.sort(nums);
        long count = 0;

        // For each element, find how many valid pairs it can form with elements after it
        for (int i = 0; i < nums.length; i++) {
            // Find the first index j > i such that nums[i] + nums[j] >= lower
            int left = lowerBound(nums, i + 1, lower - nums[i]);

            // Find the first index j > i such that nums[i] + nums[j] > upper
            int right = upperBound(nums, i + 1, upper - nums[i]);

            // All elements from left to right-1 are valid
            count += right - left;
        }

        return count;
    }

    // Custom lowerBound function to find first index with value >= target
    private int lowerBound(int[] nums, int start, int target) {
        int low = start, high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    // Custom upperBound function to find first index with value > target
    private int upperBound(int[] nums, int start, int target) {
        int low = start, high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
