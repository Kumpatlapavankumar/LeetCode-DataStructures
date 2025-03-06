class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int twice = -1, missing = -1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int num = Math.abs(grid[i][j]) - 1;
                int r = num / n, c = num % n;
                if (grid[r][c] < 0)
                    twice = num + 1;
                else
                    grid[r][c] = -grid[r][c];
            }
        }
        for (int r = 0; r < n; r++){
            for (int c = 0; c < n; c++){
                if (grid[r][c] > 0){
                    missing = r * n + c + 1;
                    break;
                }
            }
        }
        return new int[]{twice, missing};
    }
}
