import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // a. Create two double variables named first and second and a String variable named op.
        double first, second, result;
        String op;
        Scanner input = new Scanner(System.in);

        // b. Get input values for all variables.
        System.out.println("Enter first number:");
        first = input.nextDouble();

        System.out.println("Enter second number:");
        second = input.nextDouble();

        System.out.println("Choose an operator (+, -, *, /):");
        op = input.next();

        // Initialize result variable
        result = 0;

        // e. Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
        // f. If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;

            case "-":
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;

            case "*":
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;

            case "/":
                // Basic division error handling
                if (second == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = first / second;
                    System.out.println(first + " / " + second + " = " + result);
                }
                break;

            // g. If op is neither of those 4 values, print Invalid Operator. in java
            default:
                System.out.println("Invalid Operator!");
                break;
        }

        input.close();
    }
}
