
// Heap Insertion Using (Function)

import java.util.Scanner;

class HeapInsertion2 {
  public static void heapifyUp(int[] heap, int size) {
    int current = size - 1;
    while (current > 0) {
      int parent = (current - 1) / 2;

      if (heap[current] > heap[parent]) {
        int temp = heap[current];
        heap[current] = heap[parent];
        heap[parent] = temp;

        current = parent;
      } else {
        break;
      }
    }
  }

  public static void main(String[] args) {
    int[] heap = new int[20];
    int size = 10;

    heap[0] = 1;
    heap[1] = 3;
    heap[2] = 5;
    heap[3] = 6;
    heap[4] = 7;
    heap[5] = 8;
    heap[6] = 9;
    heap[7] = 10;
    heap[8] = 11;
    heap[9] = 12;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter The New Heap Element:");

    int newElement = scanner.nextInt();

    heap[size] = newElement;
    size++;

    heapifyUp(heap, size);

    for (int i = 0; i < size; i++) {
      System.out.println(heap[i] + "");
    }
  }
}
