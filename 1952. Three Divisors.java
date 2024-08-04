class Solution {
//don't edit this code 
    public boolean isThree(int n) {
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(k<=3){
                    k++;
                }
            }
        }
        if(k==3){
            return true;
        }else{
            return false;
        }
    }
}
