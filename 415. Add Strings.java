class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int car=0;
        while(i>=0 || j>=0 || car>0){
            int d1=0;
            int d2=0;
            if(i>=0){
                d1=num1.charAt(i)-'0';
                i--;
            }if(j>=0){
                d2=num2.charAt(j)-'0';
                j--;
            }
            int sum=d1+d2+car;
            car=sum/10;
            res.append(sum%10);
        }
        return res.reverse().toString();
    }
}
