class Solution {
    int number=0;
    public int hammingWeight(int n) {
        if(n==0){
            return 0;
        }
        hammingWeight(n/2);
        number=number+n%2;
        return number;
    }
}
