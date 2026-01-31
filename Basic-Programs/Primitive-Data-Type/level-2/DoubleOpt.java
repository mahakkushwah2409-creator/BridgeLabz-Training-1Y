import java.util.*;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first double value:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second double value:");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        sc.close();
    }
}