package p1;

public class Main {

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] players = {"North", "East", "South", "West"};


        // Display the player hand
        for (String each : players) {
            System.out.println(each);

            // Initialize the cards
            for (int i = 0; i < deck.length; i++)
                deck[i] = i;

            // Shuffle the cards
            for (int i = 0; i < deck.length; i++) {
                // Generate an index randomly
                int index = (int) (Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }

                //Display the first four cards
                for (int i = 0; i < 13;) {
                   String suit = suits[deck[i] / 13];
                   String rank = ranks[deck[i] % 13];
                   System.out.println(rank + " of " + suit);
                    i++;
                }
                System.out.println();
        }
    }
}
