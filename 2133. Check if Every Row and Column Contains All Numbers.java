class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            boolean[] rowSeen = new boolean[n];
            boolean[] colSeen = new boolean[n];

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > n || rowSeen[matrix[i][j] - 1]) {
                    return false;
                }
                rowSeen[matrix[i][j] - 1] = true;

                if (matrix[j][i] < 1 || matrix[j][i] > n || colSeen[matrix[j][i] - 1]) {
                    return false;
                }
                colSeen[matrix[j][i] - 1] = true;
            }
        }

        return true;
    }
}
