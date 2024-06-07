class Solution {
    public int countDigits(int num) {
        int val=0;
        int original=num;
        int count=0;
        while(num>0){
            val=num%10;
            num=num/10;
            if(original%val==0){
                count++;
            }
        }
        return count;
    }
}
