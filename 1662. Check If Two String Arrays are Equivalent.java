class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first="";
        for(String word:word1){
            first=first+word;
        }
        String second="";
        for(String word:word2){
            second=second+word;
        }
        return first.equals(second);
    }
}
