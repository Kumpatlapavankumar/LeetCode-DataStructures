class Solution {

    public int countValidSelections(int[] nums) {
        int count = 0;
        int nonZeros = 0;
        int n = nums.length;
        for (int x : nums) if (x > 0) nonZeros++;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (isValid(nums, nonZeros, i, -1)) count++;
                if (isValid(nums, nonZeros, i, 1)) count++;
            }
        }
        return count;
    }

    private boolean isValid(
        int[] nums,
        int nonZeros,
        int start,
        int direction
    ) {
        int n = nums.length;
        int curr = start;
        int[] temp = nums.clone();
        while (nonZeros > 0 && curr >= 0 && curr < n) {
            if (temp[curr] > 0) {
                temp[curr]--;
                direction *= -1;
                if (temp[curr] == 0) nonZeros--;
            }
            curr += direction;
        }
        return nonZeros == 0;
    }
}
