import java.util.ArrayList;
import java.util.List;

public class Deck
{
    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> unDealt;
    ArrayList<Card> dealt;

    public Deck(String[] ranks, String[] suits, int[] pointValues)
    {
        for(int i = 0; i < ranks.length; i++)
        {
            Card newCard = new Card(ranks[i], suits[i], pointValues[i]);
            deck.add(newCard);
        }
    }

    public boolean isEmpty()
    {
        return deck.size() == 0;
    }

    public int size()
    {
        return unDealt.size();
    }

    
}
