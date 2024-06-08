class Solution {
    public int trailingZeroes(int n) {
        if(n==0){
            return 0;
        }
        /*int pro=1;
        for(int i=2;i<=n;i++){
            pro=pro*i;
        }
        int count=0;
        while(pro%10==0){
            pro=pro/10;
            count++;
        }
        return count;*/
        int temp=0;
        for(int i=5;i<=n;i=i*5){
            temp=temp+n/i;
        }
        return temp;
    }
}
