class Solution {
//donot edit this code 
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
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
