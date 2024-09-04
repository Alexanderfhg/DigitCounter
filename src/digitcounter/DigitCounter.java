package digitcounter;

/**
 *
 * @author AlexanderFhg
 */

import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        // Read input values A and B
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers A and B (both between -1000 and 1000):");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        
        // Initialize an array to hold the count for each digit (0-9)
        int[] digitCounts = new int[10];

        // Ensure A is less than or equal to B
        int start = Math.min(A, B);
        int end = Math.max(A, B);

        // Count digits in the range from start to end
        for (int i = start; i <= end; i++) {
            countDigits(Math.abs(i), digitCounts);  // Counting digits ignoring the sign
        }

        // Print the results
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " is printed " + digitCounts[i] + " times.");
        }
    }

    // Helper method to count digits in a single number
    private static void countDigits(int number, int[] digitCounts) {
        if (number == 0) {
            digitCounts[0]++;
        } else {
            while (number > 0) {
                int digit = number % 10;   // Extract the last digit
                digitCounts[digit]++;      // Increment the count for this digit
                number /= 10;              // Remove the last digit
            }
        }
    }
}