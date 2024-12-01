import java.util.Scanner;
import java.util.ArrayList;

public class SquareFreeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Number : ");
        int n = sc.nextInt();

        int count = 0;
        ArrayList<Integer> factors = new ArrayList<>();
        System.out.print("Factors : 1 ");
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (isSquareFree(i)) {
                    factors.add(i);
                    count++;
                }
            }
        }

        System.out.println("\nTotal square free factors : " + count + "\nfactors are : " + factors);
    }

    static boolean isSquareFree(int factor) {
        for (int i = 2; i * i <= factor; i++) {
            if (factor % (i * i) == 0) {
                return false;
            }
        }

        return true;
    }
}
