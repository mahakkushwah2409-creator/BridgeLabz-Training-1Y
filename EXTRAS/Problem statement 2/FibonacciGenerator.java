import java.util.Scanner;

public class FibonacciGenerator {

    // Function to generate Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    // Function to take input
    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int terms = takeInput();
        generateFibonacci(terms);
    }
}