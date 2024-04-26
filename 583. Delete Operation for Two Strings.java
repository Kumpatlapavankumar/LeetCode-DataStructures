class Solution {
    public int minDistance(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] t=new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            t[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            t[0][j] = j;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                        t[i][j]=t[i-1][j-1];
                }else{
                    t[i][j]=1+Math.min(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][m];
    }
}
