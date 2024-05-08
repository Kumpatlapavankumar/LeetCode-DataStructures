class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        
        // If there are no words, return 0
        if (words.length == 0)
            return 0;
        
        // Get the last word from the array
        String lastWord = words[words.length - 1];
        
        // Return the length of the last word
        return lastWord.length();
    }
}
