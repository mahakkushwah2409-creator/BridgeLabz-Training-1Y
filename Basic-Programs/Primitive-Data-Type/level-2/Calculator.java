import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition value of 2 numbers is: " + addition);
        System.out.println("The subtraction value of 2 numbers is: " + subtraction);
        System.out.println("The multiplication value of 2 numbers is: " + multiplication);
        System.out.println("The division value of 2 numbers is: " + division);

        sc.close();
    }
}