public class DeckTester
{
    public static void main(String[] args)
    {
        String[] ranks  = {"A", "B", "C"};
        String[] suits = {"Giraffes", "Lions"};
        int[] values = {2,1,6};

        String[] ranks2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits2 = {"Spades", "Hearts", "Diamonds", "Clubs"};
        int[] values2 = {2,3,4,5,6,7,8,9,10,10,10,10,11};

        Deck deck1 = new Deck(ranks, suits, values);
        System.out.println("Unshuffled:");
        printDeck(deck1);

        System.out.println("Shuffled:");
        deck1.shuffle();
        printDeck(deck1);

        System.out.println("Dealt Card:");
        Card dealtCard = deck1.deal();
        System.out.println(dealtCard.toString() + "\n");
    }

    public static void printDeck(Deck deck)
    {
        for(int i = 0; i < deck.deck.size(); i++)
        {
            System.out.println(deck.deck.get(i).toString());
        }
        System.out.println("\n");
    }
}
