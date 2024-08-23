class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        // int[][] temp=new int[n][n];
        // for(int i=0;i<n;i++){
        //      for(int j=0;j<n;j++){
        //         temp[j][n-i-1]=matrix[i][j];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j]=temp[i][j];
        //     }
        // }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
    }
}
