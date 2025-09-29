class Solution {
    public int minScoreTriangulation(int[] v) {
        int n = v.length;
        int[][] dp = new int[n][n];
        // dp[i][j] = min score for polygon [i..j]
        for (int len=3; len<=n; len++) {
            for (int i=0; i+len-1<n; i++) {
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k=i+1; k<j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                        dp[i][k] + dp[k][j] + v[i]*v[j]*v[k]);
                }
            }
        }
        return dp[0][n-1];
    }
}
