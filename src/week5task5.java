import java.util.Scanner;
public class week5task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three corner points
        System.out.print("Enter the coordinates of point A (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of point B (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter the coordinates of point C (x3 y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Compute the lengths of the sides
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)); // Side opposite A
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); // Side opposite B
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); // Side opposite C

        // Compute the angles in radians
        double A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double C = Math.PI - A - B; // Since the sum of angles in a triangle is π

        // Convert radians to degrees
        A = Math.toDegrees(A);
        B = Math.toDegrees(B);
        C = Math.toDegrees(C);

        // Display results
        System.out.printf("The angles of the triangle are:\n");
        System.out.printf("Angle A: %.2f degrees\n", A);
        System.out.printf("Angle B: %.2f degrees\n", B);
        System.out.printf("Angle C: %.2f degrees\n", C);
    }
}
