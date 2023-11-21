class Solution {
    public int countNicePairs(int[] nums) {
        final int MOD = 1_000_000_007;
        
        Map<Integer, Integer> differenceCounts = new HashMap<>();
        int nicePairsCount = 0;

        for (int num : nums) {
            int difference = num - reverse(num);
            differenceCounts.put(difference, differenceCounts.getOrDefault(difference, 0) + 1);
        }

        for (int count : differenceCounts.values()) {
           nicePairsCount = (int) ((nicePairsCount + ((long) count * (count - 1) / 2)) % MOD);
        }

        return nicePairsCount;
    }

    private int reverse(int num) {
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return reversed;
    }
}
