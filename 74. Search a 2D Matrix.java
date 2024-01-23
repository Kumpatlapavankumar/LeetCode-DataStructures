class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return false;
        }else{
            int rows=matrix.length;
            int cols=matrix[0].length;
            int row=0;
            int col=cols-1;
            while(row<rows && col>=0){
                if(matrix[row][col]==target){
                    return true;
                }else if(matrix[row][col]<target){
                    row++;
                }else{
                    col--;
                }
            } 
        }
        return false;
    }
}
