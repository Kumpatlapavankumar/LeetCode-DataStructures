class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int maxLength = 1;
        String maxString = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLength; j <= s.length(); j++) {
                if (j - i > maxLength && ispalindrom(s.substring(i, j))) {
                    maxLength = j - i;
                    maxString = s.substring(i, j);
                }
            }
        }

        return maxString;
    }
    public static boolean ispalindrom(String s){
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
