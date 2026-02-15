import java.util.Scanner;
public class ArrayStudentGrade {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numStudents = 3; // Example: 3 students
            int numSubjects = 3; // Physics, Chemistry, Maths
            double[][] marks = new double[numStudents][numSubjects];
            String[] subjects = {"Physics", "Chemistry", "Maths"};

            // Input marks
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter marks for Student " + (i + 1) + ":");
                for (int j = 0; j < numSubjects; j++) {
                    System.out.print(subjects[j] + ": ");
                    marks[i][j] = scanner.nextDouble();
                }
            }

            // Calculate and Display Results
            System.out.println("\nStudent\tTotal\tPercentage\tGrade");
            for (int i = 0; i < numStudents; i++) {
                double total = 0;
                for (int j = 0; j < numSubjects; j++) {
                    total += marks[i][j];
                }
                double percentage = total / numSubjects;
                String grade = calculateGrade(percentage);

                System.out.println((i + 1) + "\t" + total + "\t" + String.format("%.2f", percentage) + "%\t\t" + grade);
            }
            scanner.close();
        }

        // Method to determine grade
        public static String calculateGrade(double percentage) {
            if (percentage >= 90) return "A+";
            else if (percentage >= 80) return "A";
            else if (percentage >= 70) return "B";
            else if (percentage >= 60) return "C";
            else return "F";
        }
    }