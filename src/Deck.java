import java.util.ArrayList;
import java.util.List;

public class Deck
{
    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> unDealt = new ArrayList<>();
    ArrayList<Card> dealt = new ArrayList<>();

    /**
   FIX CREATING DECK
     */
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
        return deck.isEmpty();
    }

    public int size()
    {
        return unDealt.size();
    }

    public Card deal()
    {
        if(deck.isEmpty())
        {
            return null;
        }
        Card dealtCard = deck.get(0);
        deck.remove(0);
        dealt.add(dealtCard);
        return dealtCard;
    }

    public void shuffle()
    {
        deck.addAll(dealt);
        dealt.clear();
        for(int k = 51; k > 1; k--)
        {
            int r = (int)(Math.random()*k);
            Card temp = deck.get(k);
            deck.set(k, deck.get(r));
            deck.set(r, temp);
        }
    }

    
}
