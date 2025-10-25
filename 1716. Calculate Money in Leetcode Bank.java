class Solution {
    public int totalMoney(int n) {
        final int q=n/7, r=n%7;
        return 28*q+7*q*(q-1)/2+(2*q+r+1)*r/2;
    }
}
