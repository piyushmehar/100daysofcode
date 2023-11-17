import java.util.Arrays;

public class MinimizeMaximumPairSum {
    public int minMaxPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;
        int result = 0;

        // Pair up elements from the extremes
        for (int i = 0; i < n / 2; i++) {
            result = Math.max(result, nums[i] + nums[n - i - 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        MinimizeMaximumPairSum solution = new MinimizeMaximumPairSum();
        
        // Example usage
        int[] nums = {3, 5, 2, 3};
        int result = solution.minMaxPairSum(nums);
        System.out.println("Output: " + result);
    }
}
