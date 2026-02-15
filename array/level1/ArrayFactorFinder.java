package com.gla.array.level1;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFactorFinder {

        public static void main(String[] args) {
            // a. Take the input for a number
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to find its factors: ");
            int number = scanner.nextInt();
            scanner.close();

            // b. Find the factors of the number and save them in an array.
            // Initialize maxFactor to 10, factors array of size maxFactor and index variable
            int maxIndex = 10;
            int[] factors = new int[maxIndex];
            int index = 0;

            System.out.println("The factors of " + number + " are:");

            // c. To find factors loop through the numbers from 1 to the number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    // If the index is equal to maxIndex, then need factors array to store more elements
                    if (index == maxIndex) {
                        // d. To store more elements, reset the maxIndex to twice its size
                        maxIndex *= 2;
                        // use the temp array to store the elements from the factors array
                        int[] tempArray = new int[maxIndex];
                        for (int j = 0; j < factors.length; j++) {
                            tempArray[j] = factors[j];
                        }
                        // eventually assign the factors array to the temp array
                        factors = tempArray;
                    }
                    // add them to the array element by incrementing the index
                    factors[index] = i;
                    index++;
                }
            }

            // e. Finally, Display the factors of the number in java arrays
            // Use Arrays.copyOf to get only the valid factors from the resized array
            int[] finalFactors = Arrays.copyOf(factors, index);
            System.out.println(Arrays.toString(finalFactors));
        }
    }


