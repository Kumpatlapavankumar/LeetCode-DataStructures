class Solution {
    public int minDistance(String str1, String str2) {
        int longest=longestcommon(str1,str2); 
	    int insertion=str1.length()-longest;
	    int deletion=str2.length()-longest;
	    int sum=insertion+deletion;
	    return sum;
    }
    public static int longestcommon(String a,String b){
	    int n=a.length();
	    int m=b.length();
	    int[][] dp=new int[n+1][m+1];
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=m;j++){
	            if(i==0 || j==0){
	                dp[i][j]=0;
	            }else if(a.charAt(i-1)==b.charAt(j-1)){
	                dp[i][j]=1+dp[i-1][j-1];
	            }else{
	                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    return dp[n][m];
	}
}
