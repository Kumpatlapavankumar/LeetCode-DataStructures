class Solution {
    public int reverse(int x) {
        long reverse=0;
        int y=Math.abs(x);
        while(y>0){
            int a=y%10;
            y=y/10;
            reverse=reverse*10+a;
        }
        if(Integer.MAX_VALUE<reverse){
            return 0;
        }
        if(x<0){
            return -1*(int)reverse;
        }
        return (int)reverse;
    }
}
