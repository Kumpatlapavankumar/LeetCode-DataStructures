class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder t = new StringBuilder();
            for (int i = 0; i + 1 < s.length(); i++) {
                t.append((s.charAt(i) - '0' + s.charAt(i + 1) - '0') % 10);
            }
            s = t.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
