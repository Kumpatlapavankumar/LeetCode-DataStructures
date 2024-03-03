class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        if(s.length()==0 || t.length()==0){
            return true;
        }
        if(s.length()==0){
            return true;
        }
        int slen=s.length();
        int tlen=t.length();
        int i=0;
        int j=0;
        while(i<slen && j<tlen){
            if(s.charAt(i)==t.charAt(j)){
            i++;
            j++;
            if(i==slen){
                return true;
            }
        }else{
            j++;
            }
        }
        return false;
    }
}
