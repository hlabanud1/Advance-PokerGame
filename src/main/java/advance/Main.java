package advance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Shuffling ... Shuffling ... Shuffling ... ");

        Deck deck = new Deck();
        // Simulate shuffling a standard deck of 52 cards
        deck.shuffle();

        System.out.println(deck);

        List<Card> selectedCards = deck.getSelectedCards();
        System.out.println(selectedCards);

        List<Card> cards = new ArrayList<>();

        for (int i=0; i < selectedCards.size();i++) {
            cards.add(selectedCards.get(i));
        }

        System.out.print("Your hand: ");
        for (Card card : cards) {
            System.out.print(card.rank()+ "" + card.suit() + " ");
        }

        System.out.println();
        Hand evaluate = Hand.evaluate(cards);
        System.out.println("You have: " + evaluate.category().getLabel());
    }

}
