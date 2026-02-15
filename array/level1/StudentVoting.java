package com.gla.array.level1;
import java.util.Scanner;
public class StudentVoting {

        public static void main(String[] args) {
            // Define an array of 10 integer elements
            int[] ages = new int[10];
            Scanner scanner = new Scanner(System.in);

            // Take user input for the student's age
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Enter age for student " + (i + 1) + ": ");
                ages[i] = scanner.nextInt();
            }

            System.out.println("\n--- Voting Eligibility Results ---");

            // Loop through the array using the length property
            for (int i = 0; i < ages.length; i++) {
                int currentAge = ages[i];

                // If the age is a negative number print an invalid age
                if (currentAge < 0) {
                    System.out.println("The student with the age " + currentAge + " is invalid age.");
                }
                // if 18 or above, print The student with the age ___ can vote.
                else if (currentAge >= 18) {
                    System.out.println("The student with the age " + currentAge + " can vote.");
                }
                // Otherwise, print The student with the age ___ cannot vote.
                else {
                    System.out.println("The student with the age " + currentAge + " cannot vote.");
                }
            }
            scanner.close();
        }
    }


