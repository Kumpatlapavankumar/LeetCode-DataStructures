class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();
        
        // Remove non-alphanumeric characters
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        
        // Check if the modified string is a palindrome
        String modified = sb.toString();
        int left = 0, right = modified.length() - 1;
        while (left < right) {
            if (modified.charAt(left) != modified.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
