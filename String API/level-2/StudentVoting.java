import java.util.Scanner;
import java.util.Random;

public class StudentVoting {

    // Method to generate random 2-digit ages
    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(90); // generates age between 10 and 99
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            } 
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void display(String[][] arr) {

        System.out.println("Age\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        String[][] result = checkVoting(ages);

        display(result);
    }
}import java.util.Scanner;
import java.util.Random;

public class StudentVoting {

    // Method to generate random 2-digit ages
    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(90); // generates age between 10 and 99
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            } 
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void display(String[][] arr) {

        System.out.println("Age\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        String[][] result = checkVoting(ages);

        display(result);
    }
}