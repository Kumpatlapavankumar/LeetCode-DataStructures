class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=0;
        int col=0;
        int n=board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                char c=board[i][j];
                board[i][j]='.';
                if(isvalid(board,i,j,n,c)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isvalid(char[][] board,int row,int col,int n,int c){
        for(int k=0;k<n;k++){
            if(board[row][k]==c || board[k][col]==c){
                return false;
            }
        }
        int start=(int)Math.sqrt(n);
        int rowstart=row-row%start;
        int colstart=col-col%start;
        for(int i=0;i<start;i++){
            for(int j=0;j<start;j++){
                if(board[i+rowstart][j+colstart]==c){
                    return false;
                }
            }
        }
        return true;
    }
}
