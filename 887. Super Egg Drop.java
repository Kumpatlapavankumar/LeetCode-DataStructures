class Solution {
    public int superEggDrop(int k, int n) {
        int[][] dp=new int[k+1][n+1];
        for(int i=1;i<=k;i++){
            dp[i][1]=1;
        }
        for(int j=1;j<=n;j++){
            dp[1][j]=j;
        }
        for(int i=2;i<=k;i++){
            for(int j=2;j<=n;j++){
                dp[i][j]=Integer.MAX_VALUE;
                int low=1;
                int high=j;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    int breaks=dp[i-1][mid-1];
                    int notbreak=dp[i][j-mid];
                    dp[i][j]=Math.min(dp[i][j],1+Math.max(breaks,notbreak));
                    if(breaks>notbreak){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
                }
            }
        }
        return dp[k][n];
    }
}
