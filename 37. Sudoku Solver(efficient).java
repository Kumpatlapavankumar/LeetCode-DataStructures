class Solution {
    static int n;
    public void solveSudoku(char[][] board) {
        n=board.length;
        solving(board);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean solving(char[][] board){
        int row=-1;
        int col=-1;
        boolean isEmpty=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    row=i;
                    col=j;
                    isEmpty=false;
                    break;
                }
            }
            if(!isEmpty){
                break;
            }
        }
        if(isEmpty){
            return true;
        }
        for(char c='1';c<='9';c++){
            if(issafe(board,row,col,c)==true){
                board[row][col]=c;
                if(solving(board)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public static boolean issafe(char[][] board,int row,int col,char c){
        for(int k=0;k<n;k++){
            if(board[row][k]==c || board[k][col]==c){
                return false;
            }
        }
        int start=(int)Math.sqrt(n);
        int rs=row-row%start;
        int cs=col-col%start;
        for(int r=0;r<start;r++){
            for(int co=0;co<start;co++){
                if(board[r+rs][co+cs]==c){
                    return false;
                }
            }
        }
        return true;
    }
}
