package com.gla.array.level1;
import java.util.Scanner;

public class ArrayFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // 1. Take a positive integer as user input
        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (number <= 0);

        // 2. Create a String array to save the results
        // The array size should be 'number + 1' to account for the loop from 0 to 'number'
        // if you want to use 0-based indexing for values 0 to number, or 'number' if you loop 1 to number.
        // As per the request to loop from 0 to the number:
        String[] resultsArray = new String[number + 1];

        // 3. Loop from 0 to the number and save the results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultsArray[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                resultsArray[i] = "Fizz";
            } else if (i % 5 == 0) {
                resultsArray[i] = "Buzz";
            } else {
                resultsArray[i] = String.valueOf(i);
            }
        }

        // 4. Finally, loop again to show the results of the array based on the index position
        System.out.println("\n--- FizzBuzz Results ---");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + resultsArray[i]);
        }

        scanner.close();
    }
}

