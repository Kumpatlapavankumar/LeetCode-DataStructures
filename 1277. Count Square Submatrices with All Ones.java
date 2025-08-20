class Solution {
    public int countSquares(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return 0;
        }

        int m = A.length;
        int n = A[0].length;
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 1 && i > 0 && j > 0) {
                    A[i][j] = Math.min(
                        A[i - 1][j - 1],
                        Math.min(A[i - 1][j], A[i][j - 1])
                    ) + 1;
                }
                res += A[i][j];
            }
        }

        return res;
    }
}
