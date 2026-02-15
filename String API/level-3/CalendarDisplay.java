import java.util.Scanner;

public class CalendarDisplay {

    // Month names array
    private static final String[] MONTHS = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in month array (non-leap year)
    private static final int[] DAYS = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month input.");
            return;
        }

        // Display the calendar
        displayCalendar(month, year);
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + MONTHS[month] + " " + year);
        System.out.println("---------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Get the first day of the month (0=Sun, 1=Mon, ...)
        int startDay = getStartDay(month, year);
        // Get the number of days in the month
        int numDays = getNumberOfDays(month, year);

        // First loop for indentation
        for (int i = 0; i < startDay; i++) {
            System.out.printf("    "); // 4 spaces for alignment with "%3d "
        }

        // Second loop to display days
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day); // Right-justified, width 3

            // Move to next line after Saturday (startDay + day is the day of the week index)
            if (((startDay + day) % 7 == 0) || (day == numDays)) {
                System.out.println();
            }
        }
        System.out.println("---------------------------");
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS[month];
    }

    // Method to get the start day of the month using Gregorian algorithm
    public static int getStartDay(int month, int year) {
        // Algorithm variables
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7; // We use '1' for day 'd'

        return d0;
    }
}