import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double resultAdd = number1 + number2;
        double resultSub = number1 - number2;
        double resultMul = number1 * number2;
        double resultDiv = number1 / number2;

        System.out.println("The addition value of the two numbers is: " + resultAdd);
        System.out.println("The subtraction value of the two numbers is: " + resultSub);
        System.out.println("The multiplication value of the two numbers is: " + resultMul);
        System.out.println("The division value of the two numbers is: " + resultDiv);

        sc.close();
    }
}