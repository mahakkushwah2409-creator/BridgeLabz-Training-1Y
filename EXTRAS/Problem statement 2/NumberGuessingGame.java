import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int low = 1;
    static int high = 100;

    // Method to generate guess
    public static int generateGuess() {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    public static String getFeedback(Scanner sc) {
        System.out.print("Is the guess High, Low, or Correct? ");
        return sc.nextLine().toLowerCase();
    }

    // Method to update range
    public static void updateRange(int guess, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = generateGuess();
            System.out.println("Computer guesses: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Yay! Computer guessed correctly.");
                break;
            } else {
                updateRange(guess, feedback);
            }
        }

        sc.close();
    }
}