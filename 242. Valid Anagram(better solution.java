import java.util.Arrays;

class Solution {
    int CHAR=256;
    public boolean isAnagram(String s, String t) {
        // Check if lengths are equal
        if(s.length()!=t.length()){
            return false;
        }
        int[] count=new int[CHAR];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
