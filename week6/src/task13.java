import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Both numbers must be positive integers.");
            return;
        }

        int gcd = findGCD(num1, num2);

        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

