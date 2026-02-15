package com.gla.array.level1;
import java.util.Scanner;
public class ArrayMultiplicationTable {

        public static void main(String[] args) {
            // a. Get an integer input and store it in the number variable.
            //    Define an integer array to store the results of multiplication from 1 to 10.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer to see its multiplication table: ");
            int number = scanner.nextInt();
            int[] tableResults = new int[10]; // Array to store 10 results (indices 0 to 9)

            // b. Run a loop from 1 to 10 and store the results in the multiplication table array.
            for (int i = 1; i <= 10; i++) {
                tableResults[i - 1] = number * i; // Store result at index i-1 (0-9)
            }

            // c. Finally, display the result from the array in the format number * i is = ___ in java arrays.
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                // Access the stored result using the corresponding array index
                int result = tableResults[i - 1];
                System.out.println(number + " * " + i + " is = " + result);
            }

            scanner.close(); // Close the scanner resource
        }
    }


