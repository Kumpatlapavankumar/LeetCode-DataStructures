class Solution {
    public void reverseString(char[] s) {
         int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at the left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
