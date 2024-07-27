class Solution {
    public int lengthOfLIS(int[] a) {
        int n=a.length;
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(a[i]>a[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int result=0;
        for(int i=0;i<=n;i++){
            result=Math.max(result,dp[i]);
        }
        return result;
    }
}
