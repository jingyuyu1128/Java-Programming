
import java.util.Scanner;

public class exercise2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);

        double total = subtotal + gratuity;

        System.out.printf("Gratuity: $%.2f%n", gratuity);
        System.out.printf("Total: $%.2f%n", total);

        scanner.close();
    }
}

