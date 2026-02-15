package com.gla.array.level2;
import java.util.Scanner;
public class DigitFrequency {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            long number = scanner.nextLong(); // Take input for a number

            // Convert the number to a string to easily find the count of digits and iterate
            String numStr = Long.toString(number);
            int numLength = numStr.length(); // Find the count of digits

            // Optional: Handle negative numbers by ignoring the minus sign
            if (number < 0) {
                numStr = numStr.substring(1);
                numLength = numStr.length();
            }

            // Define a frequency array of size 10 (indices 0-9 for each digit)
            int[] frequency = new int[10];

            // Loop through the digits string, and increase the frequency of each digit
            for (int i = 0; i < numLength; i++) {
                // Get the character at the current index
                char digitChar = numStr.charAt(i);
                // Convert the character to an integer digit (e.g., '5' -> 5)
                int digit = Character.getNumericValue(digitChar);
                // Increase the count in the frequency array for that digit
                frequency[digit]++;
            }

            // Display the frequency of each digit
            System.out.println("Digit frequencies:");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + ": " + frequency[i] + " times");
                }
            }

            scanner.close();
        }
    }


