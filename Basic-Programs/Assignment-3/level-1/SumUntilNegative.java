import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum. The program will stop when you enter 0 or a negative number.");

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                break;
            }

            sum += number;
        }

        scanner.close();

        System.out.println("The final sum of the positive numbers entered is: " + sum);
    }
}

