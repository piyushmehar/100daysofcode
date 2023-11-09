class Solution {
    public int countHomogenous(String s) {
        final int MOD = 1_000_000_007;
        long count = 0;  // Use long to prevent overflow
        int current = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } else {
                count = (count + (long)current * (current + 1) / 2) % MOD;
                current = 1;
            }
        }

        count = (count + (long)current * (current + 1) / 2) % MOD;

        return (int)count;
    }
}
