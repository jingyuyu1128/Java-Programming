import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double sideLength = scanner.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

        System.out.printf("The area of the hexagon is: %.2f%n", area);

        scanner.close();
    }
}
