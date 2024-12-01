public class FindMaxSubArray {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            System.out.println("nums[i] =" + nums[i]);
            System.out.println("maxEndingHere =" + maxEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums)); // Output: 6
    }
}