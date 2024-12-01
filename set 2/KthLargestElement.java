import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        // Create a min-heap with a capacity of k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Iterate through the array
        for (int num : nums) {
            minHeap.offer(num); // Add the current number to the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if size exceeds k
            }
        }

        // The root of the min-heap is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(findKthLargest(nums, k)); // Output: 5
    }
}