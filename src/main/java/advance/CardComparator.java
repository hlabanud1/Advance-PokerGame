package advance;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    //Sort the cards in ascending order by rank and suit
    @Override
    public int compare(Card card1, Card card2) {
        if (card1.rank().value() != card2.rank().value()) {
            return card1.rank().value() - card2.rank().value();
        } else {
            return card1.suit().compareTo(card2.suit());
        }
    }
}