import java.util.Arrays;
class Solution {
    public long countValidNumbers(int idx, int tight, String numStr, String suffix, int limit, int numLength, long[][] dp) {
        if (idx == numLength) return 1;
        if (dp[idx][tight] != -1) return dp[idx][tight];
        long lowerBound = 0, count = 0;
        int upperBound = tight == 1 ? Math.min(limit, numStr.charAt(idx) - '0') : limit;
        int suffixStartIdx = numLength - suffix.length();
        if (suffixStartIdx <= idx) {
            lowerBound = suffix.charAt(idx - suffixStartIdx) - '0';
            upperBound = Math.min(upperBound, suffix.charAt(idx - suffixStartIdx) - '0');
        }
        for (int i = (int) lowerBound; i <= upperBound; i++)
            count += countValidNumbers(idx + 1, (tight == 1 && i == numStr.charAt(idx) - '0') ? 1 : 0, numStr, suffix, limit, numLength, dp);
        dp[idx][tight] = count;
        return count;
    }
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        String upperLimit = Long.toString(finish);
        String lowerLimit = Long.toString(start - 1);
        int upperLength = upperLimit.length(), lowerLength = lowerLimit.length();
        long upperCount = 0, lowerCount = 0;
        if (s.length() <= upperLength) {
            long[][] dp = new long[upperLength][2];
            for (int i = 0; i < upperLength; i++) Arrays.fill(dp[i], -1);
            upperCount = countValidNumbers(0, 1, upperLimit, s, limit, upperLength, dp);
        }
        if (s.length() <= lowerLength) {
            long[][] dp = new long[lowerLength][2];
            for (int i = 0; i < lowerLength; i++) Arrays.fill(dp[i], -1);
            lowerCount = countValidNumbers(0, 1, lowerLimit, s, limit, lowerLength, dp);
        }
        return upperCount - lowerCount;
    }
}
