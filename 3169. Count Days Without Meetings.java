import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        int today = 0;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] meeting : meetings) {
            int i = meeting[0], j = meeting[1];

            if (j <= today) continue;
            else if (i > today) days -= j - i + 1;
            else days -= j - today;

            today = j;
        }

        return days;
    }
}
