package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards = new ArrayList<>();
    private List<Card> selectedCards = new ArrayList<>();

    public Deck() {
        cards = initializeDeck();
        selectedCards = new ArrayList<>();
    }

    public List<Card> getSelectedCards() {
        return selectedCards;
    }

    private List<Card> initializeDeck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to pass the size of the Hand
    public void dealHand(int count) {
        selectedCards = cards.subList(0, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<cards.size();i++) {
            sb.append(cards.get(i)).append(" ");
        }
        return sb.toString();
    }

}
