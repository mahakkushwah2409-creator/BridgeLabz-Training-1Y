package wrapperClasses;

public class GameScoreboard {

        public static void main(String[] args) {

            // Scores (null = player hasn't played)
            Integer[] scores = {100, null, 250, 300, null, 150};

            int notPlayed = 0;
            int totalScore = 0;

            for (Integer score : scores) {

                if (score == null) {
                    notPlayed++; // count players who haven't played
                } else {
                    totalScore += score; // auto-unboxing (Integer → int)
                }
            }

            // Output
            System.out.println("Players not played: " + notPlayed);
            System.out.println("Total Score: " + totalScore);
        }
    }

