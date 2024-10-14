import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);

        int correctAnswer = num1 + num2;

        System.out.println("ask: " + num1 + " + " + num2 + " =?");

        int userAnswer = -1;

        while (userAnswer != correctAnswer) {
            userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("you got it!");
            }
        }

        scanner.close();
    }
}

