class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];

            int[] subarray = Arrays.copyOfRange(nums, left, right + 1);
            Arrays.sort(subarray);

            result.add(isArithmeticSequence(subarray));
        }

        return result;
    }

    private boolean isArithmeticSequence(int[] subarray) {
        if (subarray.length < 2) {
            return false;
        }

        int diff = subarray[1] - subarray[0];

        for (int i = 2; i < subarray.length; i++) {
            if (subarray[i] - subarray[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }
}
