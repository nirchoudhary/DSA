public class MaxSumOfKConsecutiveElements {

    public static String maxSum(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            return "Invalid";
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int currentSum = maxSum;

        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return String.valueOf(maxSum);
    }

    public static void main(String[] args) {
        int[] arr1 = { 100, 200, 300, 400 };
        int k1 = 2;
        System.out.println(maxSum(arr1, k1)); // Output: 700

        int[] arr2 = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k2 = 4;
        System.out.println(maxSum(arr2, k2)); // Output: 39

        int[] arr3 = { 2, 3 };
        int k3 = 3;
        System.out.println(maxSum(arr3, k3)); // Output: Invalid
    }
}