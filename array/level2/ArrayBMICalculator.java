package com.gla.array.level2;
import java.util.Scanner;
public class ArrayBMICalculator {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // a. Take input for number of persons
            System.out.print("Enter the number of persons: ");
            int number = input.nextInt();

            // b. Create multi-dimensional array and status array
            // personData stores [weight][height][BMI]
            double[][] personData = new double[number][3];
            String[] weightStatus = new String[number];

            // c. Take input for weight and height
            for (int i = 0; i < number; i++) {
                System.out.println("\nData for Person " + (i + 1) + ":");

                // Validate Weight
                double weight;
                do {
                    System.out.print("Enter weight (kg): ");
                    weight = input.nextDouble();
                    if (weight <= 0) System.out.println("Please enter a positive value.");
                } while (weight <= 0);
                personData[i][0] = weight;

                // Validate Height
                double height;
                do {
                    System.out.print("Enter height (meters): ");
                    height = input.nextDouble();
                    if (height <= 0) System.out.println("Please enter a positive value.");
                } while (height <= 0);
                personData[i][1] = height;

                // d. Calculate BMI and determine status
                double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
                personData[i][2] = bmi;

                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 25) {
                    weightStatus[i] = "Normal weight";
                } else if (bmi < 30) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }

            // e. Display results using the arrays
            System.out.println("\n-------------------------------------------------------------");
            System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Weight", "Height", "BMI", "Status");
            System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < number; i++) {
                System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n",
                        (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
            }

            input.close();
        }
    }

