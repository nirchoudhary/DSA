
// 12.	write a function in C to print following pattern

// Note: Only number of columns will be the input parameter to the function

// Half diamond

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class HalfDiamondPattern {

    public static void printHalfDiamond(int cols) {
        // Upper part of the diamond (increasing part)
        for (int i = 1; i <= cols; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower part of the diamond (decreasing part)
        for (int i = cols - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Call the function to print the half diamond pattern
        printHalfDiamond(cols);

        scanner.close();

    }
}
