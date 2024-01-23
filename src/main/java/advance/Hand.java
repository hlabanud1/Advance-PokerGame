package advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static advance.Category.*;
import static advance.Rank.ACE;
import static advance.Rank.FIVE;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public record Hand(Category category, Rank... ranks) implements Comparable<Hand> {

    public static Hand evaluate(List<Card> cards) {
        if (cards.size() != 5) {
            throw new IllegalArgumentException();
        }
        var flush = cards.stream().map(Card::suit).distinct().count() == 1;
        var counts = cards.stream().collect(groupingBy(Card::rank, counting()));
        var ranks = counts.entrySet().stream().sorted(comparing(Map.Entry<Rank, Long>::getValue).thenComparing(Map.Entry::getKey).reversed())
                .map(Map.Entry::getKey).toArray(Rank[]::new);

        if (ranks.length == 4) {
            return new Hand(ONE_PAIR, ranks);
        } else if (ranks.length == 3) {
            return new Hand(counts.get(ranks[0]) == 2 ? TWO_PAIR : THREE_OF_A_KIND, ranks);
        } else if (ranks.length == 2) {
            return new Hand(counts.get(ranks[0]) == 3 ? FULL_HOUSE : FOUR_OF_A_KIND, ranks);
        } else if (ranks[0].ordinal() - ranks[4].ordinal() == 4) {
            return new Hand(flush ? STRAIGHT_FLUSH : STRAIGHT, ranks[0]);
        } else if (ranks[0].equals(ACE) && ranks[1].equals(FIVE)) {
            return new Hand(flush ? STRAIGHT_FLUSH : STRAIGHT, FIVE);
        } else {
            return new Hand(flush ? FLUSH : HIGH_CARDS, ranks);
        }
    }

    @Override
    public int compareTo(Hand hand) {
        return comparing(Hand::category).thenComparing(Hand::ranks, Arrays::compare).compare(this, hand);
    }

}


