import java.util.Scanner;

public class week5task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 15) {
                String hexNumber = Integer.toHexString(number).toUpperCase();
                System.out.println(number + " in the form of hexnumber " + hexNumber);
            }
            else{
                System.out.println("error\n");
            }
            scanner.close();
        }
    }


