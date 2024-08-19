class Solution {
    public int jump(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(j+arr[j]>=i){
                    if(dp[j]!=Integer.MAX_VALUE){
                        dp[i]=Math.min(dp[i],dp[j]+1);
                    }
                }
            }
        }
        return dp[n-1];
    }
}
