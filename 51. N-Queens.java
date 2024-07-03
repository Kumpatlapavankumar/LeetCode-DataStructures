class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list =new ArrayList<>();
        int[][] board=new int[n][n];
        solving(board,0,n,list);
        return list;
    }
    public static void solving(int[][] board,int col,int n,List<List<String>> list){
        if(col==n){
            list.add(construct(board,n));
        }
        for(int row=0;row<n;row++){
            if(issafe(board,row,col,n)){
                board[row][col]=1;
                solving(board,col+1,n,list);
                board[row][col]=0;
            }
        }
    }
    public static boolean issafe(int[][] board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[row][i]==1){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static List<String> construct(int[][] board,int n){
        List<String> solution=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder row=new StringBuilder();
            for(int j=0;j<n;j++){
                row.append(board[i][j]==1?"Q":".");
            }
            solution.add(row.toString());
        }
        return solution;
    }
}
