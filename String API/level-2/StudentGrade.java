import java.util.Random;

public class StudentGrade {

    // Method to generate random 2-digit marks for PCM
    public static int[][] generateMarks(int students) {
        Random r = new Random();
        int[][] marks = new int[students][3]; // 3 subjects: PCM

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + r.nextInt(90); // 10–99 (2 digit)
            }
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResult(int[][] marks) {
        int students = marks.length;
        double[][] result = new double[students][3]; 
        // 0 = total, 1 = average, 2 = percentage

        for (int i = 0; i < students; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grade using String
    public static String getGrade(double percentage) {

        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }

    // Display scorecard
    public static void display(int[][] marks, double[][] result) {

        System.out.println("Roll\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {

            String grade = getGrade(result[i][2]);

            System.out.println((i+1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade);
        }
    }

    public static void main(String[] args) {

        int students = 5; // number of students

        int[][] marks = generateMarks(students);
        double[][] result = calculateResult(marks);

        display(marks, result);
    }
}