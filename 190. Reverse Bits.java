//donot edit this code
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse=0;
        for(int i=0;i<32;i++){
            int bit=n&1;
            reverse=(reverse<<1)|bit;
            n>>=1;
        }
        return reverse;
    }
}
