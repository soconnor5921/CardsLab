import java.util.ArrayList;
import java.util.List;

public class Deck
{
    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> unDealt = new ArrayList<>();
    ArrayList<Card> dealt = new ArrayList<>();

    public Deck(String[] ranks, String[] suits, int[] pointValues)
    {
        String rank;
        String suit ;
        int pointValue;
        for(int i = 0; i < ranks.length; i++)
        {
            rank = ranks[i];
            for(int j = 0; j < suits.length; j++)
            {
                suit = suits[j];
                for(int k = 0; k < pointValues.length; k++)
                {
                    pointValue = pointValues[k];
                    Card newCard = new Card(rank, suit, pointValue);
                    deck.add(newCard);
                    unDealt.add(newCard);
                }
            }
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
