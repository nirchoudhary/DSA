import java.util.ArrayList;
import java.util.Scanner;

public class SquareFreeNo {

    public static boolean isSquareFree(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % (i * i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> divisors = new ArrayList<>();

        // Find all divisors of N
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                divisors.add(i); // Add the divisor
                if (i != N / i) {
                    divisors.add(N / i); // Add the complementary divisor
                }
            }
        }

        int squareFreeCount = 0;

        // Check each divisor
        for (int divisor : divisors) {
            if (divisor != 1 && isSquareFree(divisor)) {
                squareFreeCount++;
            }
        }

        System.out.println(squareFreeCount);
    }
}