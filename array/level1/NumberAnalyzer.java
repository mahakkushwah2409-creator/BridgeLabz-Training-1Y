package com.gla.array.level1;

    import java.util.Scanner;

    public class NumberAnalyzer {

        public static void main(String[] args) {
            // a. Define an integer array of 5 elements and get user input to store in the array.
            int[] numbers = new int[5];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter 5 integers:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("\n--- Analysis of Numbers ---");

            // b & c. Loop through the array and check properties
            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];
                System.out.print("Number " + (i + 1) + " (" + num + "): ");

                if (num > 0) {
                    // If the number is positive, check for even or odd
                    if (num % 2 == 0) {
                        System.out.println("Positive and Even");
                    } else {
                        System.out.println("Positive and Odd");
                    }
                } else if (num < 0) {
                    // If the number is negative, print negative.
                    System.out.println("Negative");
                } else {
                    // Else if the number is zero, print zero.
                    System.out.println("Zero");
                }
            }

            System.out.println("\n--- Comparison of First and Last Elements ---");

            // d. Finally compare the first and last element of the array
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            System.out.println("First element: " + first);
            System.out.println("Last element: " + last);

            if (first == last) {
                System.out.println("The first and last elements are equal.");
            } else if (first > last) {
                System.out.println("The first element is greater than the last element.");
            } else {
                System.out.println("The first element is less than the last element.");
            }

            scanner.close();
        }
    }

