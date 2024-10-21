import java.util.Scanner;

public class task14 {

    // Method to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        // Ensure a is greater than b
        if (b == 0) {
            return a; // Base case
        }
        return calculateGCD(b, a % b); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Calculate GCD
        int gcd = calculateGCD(firstNumber, secondNumber);

        // Display the result
        System.out.println("The greatest common divisor (GCD) of " + firstNumber + " and " + secondNumber + " is: " + gcd);

        scanner.close(); // Close the scanner
    }
}

