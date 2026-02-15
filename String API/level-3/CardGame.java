public class CardGame {

    public static void main(String[] args) {
        // Step a & b: Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numPlayers = 4; // Example x number of players
        int cardsPerPlayer = 5; // Example n cards to distribute

        // Step c: Initialize the deck
        String[] deck = initializeDeck(suits, ranks);

        // Step d: Shuffle the deck
        deck = shuffleDeck(deck);

        // Step e: Distribute cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Step f: Print results
        if (players != null) {
            printPlayers(players);
        }
    }

    // c. Method to Initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }
        return deck;
    }

    // d. Method to Shuffle the deck using provided logic
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Step 2: Generate random index between i and n
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            
            // Step 3: Swap current card with random card
            String temp = deck[randomCardNumber];
            deck[randomCardNumber] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    // e. Method to distribute n cards to x players
    public static String[][] distributeCards(String[] deck, int x, int n) {
        if (x * n > deck.length) {
            System.out.println("Not enough cards in the deck!");
            return null;
        }
        
        String[][] players = new String[x][n];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[i * n + j];
            }
        }
        return players;
    }

    // f. Method to Print the players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + (j == players[i].length - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }
}