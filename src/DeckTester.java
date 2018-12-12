public class DeckTester
{
    public static void main(String[] args)
    {
        String[] ranks  = {"A", "B", "C"};
        String[] suits = {"Giraffes", "Lions"};
        int[] values = {2,1,6};

        Deck deck1 = new Deck(ranks, suits, values);

        for(int i = 0; i < deck1.size(); i++)
        {
            System.out.println(deck1.deck.get(i).toString());
        }
    }
}
