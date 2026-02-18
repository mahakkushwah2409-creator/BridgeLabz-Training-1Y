import java.util.Scanner;

public class StudentScorecard {

    // Generate random 2-digit marks
    public static int generateMarks() {
        return 10 + (int)(Math.random() * 90);
    }

    // Method to generate PCM marks
    public static int[][] generatePCM(int students) {
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++) {
            pcm[i][0] = generateMarks(); // Physics
            pcm[i][1] = generateMarks(); // Chemistry
            pcm[i][2] = generateMarks(); // Maths
        }
        return pcm;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateScores(int[][] pcm) {
        double[][] result = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3;
            double percent = (total / 300) * 100;

            result[i][0] = Math.round(total * 100) / 100.0;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(percent * 100) / 100.0;
        }
        return result;
    }

    // Method to get grade
    public static char getGrade(double percent) {
        if (percent >= 80) return 'A';
        else if (percent >= 70) return 'B';
        else if (percent >= 60) return 'C';
        else if (percent >= 50) return 'D';
        else if (percent >= 40) return 'E';
        else return 'R';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcm = generatePCM(n);
        double[][] scores = calculateScores(pcm);

        System.out.println("\nStu  P   C   M   Total  Avg  %   Grade");

        for (int i = 0; i < n; i++) {
            char grade = getGrade(scores[i][2]);

            System.out.println((i + 1) + "   " +
                    pcm[i][0] + "  " +
                    pcm[i][1] + "  " +
                    pcm[i][2] + "  " +
                    scores[i][0] + "  " +
                    scores[i][1] + "  " +
                    scores[i][2] + "  " +
                    grade);
        }
    }
}
