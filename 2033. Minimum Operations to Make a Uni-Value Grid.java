class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length, m = grid[0].length;
        int[] freq = new int[10001];
        //check -1 cases
        boolean foundFalse = false;
        int currChoice = grid[0][0];
        for (int[] row : grid) {
            for (int y : row) {
                freq[y]++;
                if (Math.abs(currChoice - y) % x != 0)
                    foundFalse = true;
            }
        }
        if (foundFalse) return -1;
        //sorting
        int[] arr = new int[n * m];
        int k = 0;
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; j < freq[i]; j++) {
                arr[k++] = i;
            }
        }
        int count = 0;
        //pick best middle element
        int median = arr[arr.length / 2];
        for (int num : arr) {
            count += Math.abs(num - median) / x;
        }
        return count;
    }
}
