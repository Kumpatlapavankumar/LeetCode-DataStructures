class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] t=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            t[i][0]=i;
        }
        for(int j=0;j<=m;j++){
            t[0][j]=j;
        }
        int cost;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    cost=0;
                }else{
                    cost=1;
                }
                t[i][j]=Math.min(Math.min(t[i-1][j-1]+cost,t[i][j-1]+1),t[i-1][j]+1);
            }
        }
        return t[n][m];
    }
}
