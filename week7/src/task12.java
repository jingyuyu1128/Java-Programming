import java.util.Scanner;

public class task12 {

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the year and month
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Step 2: Calculate days in the month
        int daysInMonth = getDaysInMonth(year, month);

        // Step 3: Get the first day of the month
        int firstDayOfWeek = getFirstDayOfMonth(year, month);

        // Step 4: Print the calendar
        printCalendar(year, month, daysInMonth, firstDayOfWeek);

        scanner.close();
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int year, int month) {
        if (month == 2) {
            return (isLeapYear(year)) ? 29 : 28;
        }
        // Months with 30 days
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        // Months with 31 days
        return 31;
    }

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to calculate the first day of the month
    public static int getFirstDayOfMonth(int year, int month) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int day = (1 + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
        return (day + 6) % 7; // Adjusting so that 0 = Sunday, 1 = Monday, etc.
    }

    // Method to print the calendar
    public static void printCalendar(int year, int month, int daysInMonth, int firstDayOfWeek) {
        System.out.printf("       %d-%02d%n", year, month);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((firstDayOfWeek + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

