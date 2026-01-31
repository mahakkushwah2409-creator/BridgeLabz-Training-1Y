import java.util.*;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value for a:");
        int a = sc.nextInt();
        System.out.println("Enter integer value for b:");
        int b = sc.nextInt();
        System.out.println("Enter integer value for c:");
        int c = sc.nextInt();
        sc.close();

        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + ".");
    }
}