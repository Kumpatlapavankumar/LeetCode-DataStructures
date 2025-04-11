class Solution {
    private static final byte[] sumfreq = new byte[18];

    static {
        for (byte i = 1; i < 100; i++)
            sumfreq[i/10+i%10-1]++;
    }

    public static int countSymmetricIntegers(final int low, final int high) {
        // 2-digit
        int t = Math.min(high, 99) / 11 - Math.min(low - 1, 99) / 11;
        // 4-digit
        if (high > 1000) {
            final int l4 = Math.max(low, 1000);
            final int lh = l4 / 100, ll = l4 % 100, hh = high / 100, hl = high % 100;
            final int slh = lh / 10 + lh % 10;
            if (lh == hh) {
                for (int i = ll; i <= hl; i++)
                    t += i / 10 + i % 10 == slh ? 1 : 0;
            } else {
                final int shh = hh / 10 + hh % 10;
                for (int i = ll; i < 100; i++)
                    t += i / 10 + i % 10 == slh ? 1 : 0;
                for (int i = 1; i <= hl; i++)
                    t += i / 10 + i % 10 == shh ? 1 : 0;
                for (int j = lh + 1; j < hh; j++)
                    t += sumfreq[j / 10 + j % 10 - 1];
            }
        }
        return t;
    }
}
