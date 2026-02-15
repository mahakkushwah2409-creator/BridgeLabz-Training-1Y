package com.gla.array.level1;
import java.util.Scanner;
public class MultiplyTable {

        public static void main(String[] args) {
            // a. Take integer input and store it in the variable number
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            // Define an integer array to store the multiplication result
            // The table runs from 6 to 9, so we need 4 elements. We can use indices 0 to 3.
            int[] multiplicationResult = new int[4];

            // b. Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
            // The loop should iterate for values of 'i' from 6 to 9
            for (int i = 6; i <= 9; i++) {
                int result = number * i;
                // Map the 'i' values (6, 7, 8, 9) to array indices (0, 1, 2, 3)
                multiplicationResult[i - 6] = result;
            }

            // c. Finally, display the result from the array in the format number * i = ___
            System.out.println("Multiplication table for " + number + " (from 6 to 9):");
            for (int i = 6; i <= 9; i++) {
                // Retrieve the stored result from the array
                int result = multiplicationResult[i - 6];
                System.out.println(number + " * " + i + " = " + result);
            }
        }
    }


