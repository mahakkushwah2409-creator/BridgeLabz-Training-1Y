import java.util.Scanner;

public class FactorialRecursive {

    // Recursive function
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Input function
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Output function
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {
        int num = takeInput();
        long result = factorial(num);
        displayResult(num, result);
    }
}