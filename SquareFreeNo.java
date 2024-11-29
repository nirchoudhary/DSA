import java.util.ArrayList;
import java.util.Scanner;

public class SquareFreeNo{

    // Method to check if a number is square-free
    public static boolean isSquareFree(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % (i * i) == 0) {
                return false; // Not square-free if divisible by a perfect square
            }
        }
        return true; // Square-free if no perfect square divides num
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input number
        int N = scanner.nextInt();
        scanner.close(); // Close the scanner to prevent resource leaks
        
        ArrayList<Integer> divisors = new ArrayList<>(); // To store divisors of N
        
        // Find all divisors of N
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                divisors.add(i); // Add the divisor
                if (i != N / i) {
                    divisors.add(N / i); // Add the complementary divisor
                }
            }
        }
        
        int squareFreeCount = 0; // To count square-free numbers
        
        // Check each divisor
        for (int divisor : divisors) {
            if (divisor != 1 && isSquareFree(divisor)) {
                squareFreeCount++; // Increment count if square-free and not 1
            }
        }
        
        // Output the count of square-free divisors
        System.out.println(squareFreeCount);
    }
}