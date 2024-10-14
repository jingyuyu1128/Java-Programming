import java.util.Scanner;

public class week5task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a letter: ");
        String input = scanner.nextLine();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char letter = Character.toLowerCase(input.charAt(0));

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a single letter.");
        }

        scanner.close();
    }
}
