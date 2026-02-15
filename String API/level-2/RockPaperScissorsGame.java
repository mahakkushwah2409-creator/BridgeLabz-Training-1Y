import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to generate computer choice
    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find winner
    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer))
            return "Draw";

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    // Method to calculate stats
    public static String[][] calculateStats(int userWins, int co