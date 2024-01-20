class Solution {
    public boolean isPerfectSquare(int num) {
        int num1=(int)Math.sqrt(num);
        int num2=(int)Math.sqrt(num);
        return num1*num2==num;
    }
}
