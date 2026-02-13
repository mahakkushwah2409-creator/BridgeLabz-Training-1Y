import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // a. Take integer input and store it in the variable number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to see its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Multiplication table for " + number + " (from 6 to 9):");

        // b. Using a for loop, find the multiplication table of number from 6 to 9 and print it
        //    in the format number * i = ___
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
