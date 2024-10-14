import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(str.charAt(left));
            char rightChar = Character.toLowerCase(str.charAt(right));

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (leftChar != rightChar) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

