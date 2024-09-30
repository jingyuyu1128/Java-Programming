

import java.util.Scanner;

public class exercise2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * length;

        double surfaceArea = 2 * Math.PI * radius * length + 2 * Math.PI * Math.pow(radius, 2);

        System.out.printf("Volume of the cylinder: %.2f%n", volume);
        System.out.printf("Surface Area of the cylinder: %.2f%n", surfaceArea);

        scanner.close();
    }
}
