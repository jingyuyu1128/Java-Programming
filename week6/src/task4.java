import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(10); // 0 to 9
            int num2 = random.nextInt(10); // 0 to 9

            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            int correctAnswer = num1 - num2;

            System.out.println("Question " + (i + 1) + ": What is " + num1 + " - " + num2 + "?");

            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct! Well done.");
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
        }

        scanner.close();
    }
}

