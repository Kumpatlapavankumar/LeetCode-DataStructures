class Solution {
    public char findTheDifference(String s, String t) {
        int[] charFrequency = new int[26];

        // Count the frequency of each character in string s
        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        // Adjust the frequency for characters in string t
        for (char c : t.toCharArray()) {
            charFrequency[c - 'a']--;
        }

        // Find the character with a non-zero frequency (added character)
        for (int i = 0; i < 26; i++) {
            if (charFrequency[i] != 0) {
                return (char) ('a' + i);
            }
        }

        return ' '; // This line should never be reached in a valid input
    }
}
