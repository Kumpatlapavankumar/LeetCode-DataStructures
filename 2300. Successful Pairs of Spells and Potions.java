class Solution {
    public int findPairs(int spell, int[] potions, long success) {
        int n = potions.length;
        int l=0,r=n-1,ind=n;
        while(l<=r) {
            int m = l + (r-l)/2;
            if((long)spell * potions[m] < success) {
                l = m + 1;
            } else {
                ind = m;
                r = m - 1;
            }
        }
        return n-ind;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++) {
            pairs[i] = findPairs(spells[i], potions, success);
        }
        return pairs;
    }
}
