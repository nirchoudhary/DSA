
// Ques 3) Given an array and an integer K, find the maximum for each and every contiguous subarray
// of size K.

// Examples :

// Input: arr[] = {1, 2, 3, 1, 4, 5}, K = 3
// Output: 3 3 4 5
// Explanation: Maximum of 1, 2, 3 is 3
// Maximum of 2, 3, 1 is 3
// Maximum of 3, 1, 4 is 4
// Maximum of 1, 4, 5 is 5

// Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4
// Output: 10 10 10 15 15 90 90
// Explanation: Maximum of first 4 elements is 10, similarly for next 4
// elements (i.e from index 1 to 4) is 10, So the sequence
// generated is 10 10 10 15 15 90 90

// Input: arr[] = {20, 10, 30}, K = 1
// Output: 20 10 30

import java.util.ArrayList;

public class MaxSubarray {
    static int findMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        return max;
    }

    static int[] findMaxInSubarray(int[] arr, int k) {
        ArrayList<Integer> kElements = new ArrayList<>();
        int maxElements[] = new int[k + 1];

        for (int i = 0; i < k; i++) {
            kElements.add(arr[i]);
        }

        int idx = 0;
        maxElements[idx++] = findMax(kElements);

        for (int i = k; i < arr.length && idx <= k; i++) {
            kElements.remove(0);
            kElements.add(arr[i]);
            maxElements[idx++] = findMax(kElements);
        }

        return maxElements;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5 };
        int k = 3;

        int[] result = findMaxInSubarray(arr, k);

        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}