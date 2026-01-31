import java.util.*;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = sc.nextDouble();
        sc.close();

        double totalInches = heightInCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("Your Height in cm is %.2f, while in feet is %d and inches is %.2f%n", heightInCm, feet, inches);
    }
}