
// Heap Insertion

import java.util.Scanner;

class HeapInsertion {
    public static void main(String[] args) {

        int[] heap = { 20, 30, 5, 6, 3, 8, 9, 10, 11, 12 };
        int size = 10;

        int[] newHeap = new int[20];

        for (int i = 0; i < size; i++) {
            newHeap[i] = heap[i];
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element For Heap: ");
        int newElement = sc.nextInt();
        System.out.println("inserting" + " " + 50 + " " + "into The Heap");

        newHeap[size] = newElement;

        size++;

        // track newly add Element
        int current = size - 1;

        while (current > 0) {
            int parent = (current - 1) / 2;

            if (newHeap[current] > newHeap[parent]) {
                int temp = newHeap[current];
                newHeap[current] = newHeap[parent];
                newHeap[parent] = temp;

                current = parent;
            } else {
                // if parnet are grater then current so stop the bubble up process
                break;
            }
        }

        System.out.println("Heap Afeter insertion");
        for (int i = 0; i < size; i++) {
            System.out.println(newHeap[i] + " ");
        }
    }
}