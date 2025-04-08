class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] seen = new boolean[101]; // chakra logbook

        // Check from the last shinobi backwards
        for (int i = nums.length - 1; i >= 0; i--) {
            if (seen[nums[i]]) {
                // Found duplicate chakra → remove from front up to here
                return (i + 3) / 3;
            }
            seen[nums[i]] = true;
        }

        // All chakra are unique, no operation needed
        return 0;
    }
}
