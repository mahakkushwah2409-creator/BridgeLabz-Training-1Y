import java.util.Scanner;

public class MaximumOfThree {

    // Method to take input
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        return numbers;
    }

    // Method to find maximum
    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        int[] nums = takeInput();

        int max = findMaximum(nums[0], nums[1], nums[2]);

        System.out.println("The maximum number is: " + max);
    }
}