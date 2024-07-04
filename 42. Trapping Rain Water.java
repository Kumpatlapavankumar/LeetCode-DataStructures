class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int[] lm=new int[n];
        int[] rm=new int[n];
        lm[0]=arr[0];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(lm[i-1],arr[i]);
        }
        rm[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rm[i]=Math.max(rm[i+1],arr[i]);
        }
        int result=0;
        for(int i=1;i<n-1;i++){
            result=result+(Math.min(lm[i],rm[i])-arr[i]);
        }
        return result;
    }
}
