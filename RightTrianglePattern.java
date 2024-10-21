// 11.	write a function in C to print following pattern

// Note: Only number of rows shall be the input parameter to the function

// Right triangle

// *
// **
// ***
// ****
// *****



import java.util.Scanner;

public class RightTrianglePattern {

    public static void printRightTriangle(int col) {
        // Outer loop for each row
        for (int i = 1; i <= col; i++) {
            // Inner loop to print stars equal to the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Call the function to print the right triangle pattern
        printRightTriangle(rows);

        scanner.close();
    }
}