import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        return gcd(smallest, largest);
    }
    
    // Helper method to find GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
