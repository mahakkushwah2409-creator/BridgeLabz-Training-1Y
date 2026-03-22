package com.gla.ExceptionHandling;
import java.util.Scanner;

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Step 2: Main class
    public class CustomException {

        // Step 3: Method to validate age
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            } else {
                System.out.println("Access granted!");
            }
        }

        // Step 4: Main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            try {
                validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }

            sc.close();
        }
    }

