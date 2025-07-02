class Solution {

    private static final int mod = 1000000007;

    public int possibleStringCount(String word, int k) {
        int n = word.length();
        // Group ka size count karne ke liye
        int currentCount = 1;

        // Sab group sizes yahan store karenge
        List<Integer> groupSizes = new ArrayList<>();

        // Group sizes banao
        for (int i = 1; i < n; ++i) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                currentCount++;
            } else {
                groupSizes.add(currentCount);
                currentCount = 1;
            }
        }
        groupSizes.add(currentCount);

        // Total combinations without restriction
        long totalWays = 1;
        for (int size : groupSizes) {
            totalWays = (totalWays * size) % mod;
        }

        // Agar groups k se jyada ya barabar hain, koi problem nahi
        if (groupSizes.size() >= k) {
            return (int) totalWays;
        }

        // DP Arrays
        int[] dp = new int[k]; // dp[j] = number of ways using j+1 groups
        int[] prefixSum = new int[k]; // prefix sum to optimize DP

        dp[0] = 1;
        Arrays.fill(prefixSum, 1);

        // Har group process karo
        for (int i = 0; i < groupSizes.size(); ++i) {
            int groupSize = groupSizes.get(i);
            int[] newDp = new int[k];

            for (int j = 1; j < k; ++j) {
                // Ye prefix sum se calculate ho raha hai
                newDp[j] = prefixSum[j - 1];

                // Agar ye group include karne se extra ho ja raha hai toh subtract karo
                if (j - groupSize - 1 >= 0) {
                    newDp[j] = (newDp[j] - prefixSum[j - groupSize - 1] + mod) % mod;
                }
            }

            // Naya prefix sum banaye
            int[] newPrefix = new int[k];
            newPrefix[0] = newDp[0];
            for (int j = 1; j < k; ++j) {
                newPrefix[j] = (newPrefix[j - 1] + newDp[j]) % mod;
            }

            dp = newDp;
            prefixSum = newPrefix;
        }

        // Total ways me se wo subtract karo jo exactly k groups se ban rahe hain
        return (int) ((totalWays - prefixSum[k - 1] + mod) % mod);
    }
}
