package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Shuffling ... Shuffling ... Shuffling ... ");

        Deck deck = new Deck();
        // Simulate shuffling a standard deck of 52 cards
        deck.shuffle();

        // randomly select first 5 cards from the shuffled deck
        deck.dealHand(5);

        //System.out.println(deck);

        List<Card> selectedCards = deck.getSelectedCards();
        Collections.sort(selectedCards, new CardComparator());

        // The 5 selectedCards are sorted
        //System.out.println(selectedCards);

        List<Card> cards = new ArrayList<>();

        for (int i=0; i < selectedCards.size();i++) {
            cards.add(selectedCards.get(i));
        }

        System.out.print("Your hand: ");
        for (Card card : cards) {
            System.out.print(card.rank()+ "" + card.suit() + " ");
        }

        System.out.println();
        Hand evaluate = Hand.evaluateHand(cards);
        System.out.println("You have: " + evaluate.category().getLabel());
    }

}
