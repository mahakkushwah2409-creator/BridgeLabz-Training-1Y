package com.gla.array.level2;
import java.util.Scanner;
public class StudentGradeArr {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            int[] physics = new int[n];
            int[] chemistry = new int[n];
            int[] maths = new int[n];
            double[] percentage = new double[n];
            char[] grade = new char[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter marks for Student " + (i + 1));

                System.out.print("Physics: ");
                physics[i] = sc.nextInt();

                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextInt();

                System.out.print("Maths: ");
                maths[i] = sc.nextInt();

                // Check negative marks
                if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                    System.out.println("Marks cannot be negative. Enter again.");
                    i--;
                    continue;
                }

                int total = physics[i] + chemistry[i] + maths[i];
                percentage[i] = total / 3.0;

                // Grade calculation
                if (percentage[i] >= 80)
                    grade[i] = 'A';
                else if (percentage[i] >= 70)
                    grade[i] = 'B';
                else if (percentage[i] >= 60)
                    grade[i] = 'C';
                else if (percentage[i] >= 50)
                    grade[i] = 'D';
                else if (percentage[i] >= 40)
                    grade[i] = 'E';
                else
                    grade[i] = 'R';
            }

            // Display Result
            System.out.println("\n----- Result -----");
            for (int i = 0; i < n; i++) {
                System.out.println("Student " + (i + 1) +
                        " -> Percentage: " + percentage[i] +
                        "% , Grade: " + grade[i]);
            }

            sc.close();
        }
    }

