class Solution {
    public String convertToBase7(int num) {
        int base=1;
        int result=0;
        while(num!=0){
            int rem=num%7;
            result+=base*rem;
            base*=10;
            num/=7;
        }
        return Integer.toString(result);
    }
}
