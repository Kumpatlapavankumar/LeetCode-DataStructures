class Solution {
    public boolean rotateString(String s, String g) {
        return s.length() == g.length() && (s + s).contains(g);
    }
}
