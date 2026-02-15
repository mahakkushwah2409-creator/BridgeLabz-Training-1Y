import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;   // convert cm to meter
        return weight / (heightM * heightM);
    }

    // Method to find BMI Status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4)
            return "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9)
            return "Normal";
        else if (bmi >= 25 && bmi <= 39.9)
            return "Overweight";
        else
            return "Obese";
    }

    // Method to compute and store result in 2D String array
    public static String[][] computeData(double[][] data) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            double bmi = calculateBMI(weight, height);
            String status = getStatus(bmi);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display result
    public static void display(String[][] arr) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1] + "\t\t" + arr[i][2] + "\t" + arr[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] input = new double[10][2];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            input[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            input[i][1] = sc.nextDouble();
        }

        String[][] output = computeData(input);
        display(output);

        sc.close();
    }
}