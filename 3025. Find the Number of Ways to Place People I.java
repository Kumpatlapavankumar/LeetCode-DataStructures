import java.util.*;

class Solution {
    public int numberOfPairs(List<List<Integer>> points) {
        // Step 1: Sort points by x ascending, then by y descending
        points.sort((a, b) -> {
            if (a.get(0).equals(b.get(0))) return b.get(1) - a.get(1);
            return a.get(0) - b.get(0);
        });
        int pairCount = 0;
        int n = points.size();

        // Step 2: Iterate through all points as potential "upper-left" points
        for (int i = 0; i < n; i++) {
            int upperY = points.get(i).get(1);
            int lowerYLimit = Integer.MIN_VALUE;

            // Step 3: Check subsequent points as potential "bottom-right" points
            for (int j = i + 1; j < n; j++) {
                int currentY = points.get(j).get(1);
                if (currentY <= upperY && currentY > lowerYLimit) {
                    pairCount++;
                    lowerYLimit = currentY;
                    if (currentY == upperY) break;
                }
            }
        }
        return pairCount;
    }
}
