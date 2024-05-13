class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
        // If we're here, it means all digits were 9, so we need to add an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // The most significant digit becomes 1
        return result;
    }
}
