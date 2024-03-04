class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";   
        }
        char[] hexChars="0123456789abcdef".toCharArray();
        StringBuilder result=new StringBuilder();
        while(num!=0){
            int remainder=num&15;
            result.insert(0,hexChars[remainder]);
            num>>>=4;
        }
        return result.toString();
    }
}
