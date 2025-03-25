//donot edit this code 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int i=row-1;
        int j=0;
        while(i>=0 && j<col){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}
