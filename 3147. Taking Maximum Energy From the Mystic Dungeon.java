class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int[] dp = new int[n];
        int maxEnergy = Integer.MIN_VALUE;
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = energy[i];
            if (i + k < n) {
                dp[i] += dp[i + k];
            }
            maxEnergy = Math.max(maxEnergy, dp[i]);
        }
        
        return maxEnergy;
    }
}
