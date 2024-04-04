import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charCount = new HashMap<>();
    
        for (char mg : magazine.toCharArray()) {
            charCount.put(mg, charCount.getOrDefault(mg, 0) + 1);
        }
        
        for (char rn : ransomNote.toCharArray()) {
            if (!charCount.containsKey(rn) || charCount.get(rn) <= 0) {
                return false;
            }
            charCount.put(rn, charCount.get(rn) - 1);
        }
        
        return true;
    }
}
