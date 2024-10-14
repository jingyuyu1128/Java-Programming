import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter integers to sum (0 to end):");

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("The total sum is: " + sum);
        scanner.close();
    }
}

