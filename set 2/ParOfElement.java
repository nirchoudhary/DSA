//Q 6 (set 2) 

class ParOfElement {
    // Naive Approach
    public static void PairOfElementNaive(int A[], int X) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] + A[j] == X) {
                    System.out.println(A[i] + "+" + A[j] + " = " + X);
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    // Two Pointer Approach
    public static void PairOfElementTwoPointer(int A[], int X) {
        int i = 0;
        int j = A.length - 1;

        while (i < j) {
            int sum = A[i] + A[j];
            if (sum == X) {
                System.out.println(A[i] + "+" + A[j] + " = " + X);
                System.out.println("Yes");
                return;
            } else if (sum < X) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        int A[] = { 4, 2, 3, 5, 6, 7, };
        int X = 9;

        // Call Naive Approach
        System.out.println("Using Naive Approach:");
        PairOfElementNaive(A, X);

        // Call Two Pointer Approach
        System.out.println("Using Two Pointer Approach:");
        PairOfElementTwoPointer(A, X);
    }
}