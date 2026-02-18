import java.util.Scanner;

public class GCDLCMCalculator {

    // Function to calculate GCD
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    // Function to calculate LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Function to take input
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        return numbers;
    }

    public static void main(String[] args) {

        int[] nums = takeInput();

        int gcd = findGCD(nums[0], nums[1]);
        int lcm = findLCM(nums[0], nums[1]);

        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
    }
}
