package advance;

public enum Category {

    STRAIGHT_FLUSH("Straight Flush"), // All card with the same suite in order
    FOUR_OF_A_KIND("Four of a Kind"),
    FULL_HOUSE("Full House"), // A pair and 3 cards of a kind
    FLUSH("Flush"), // all the cards have the same suite
    STRAIGHT("Straight"), // All cards are in order but with different suite
    THREE_OF_A_KIND("Three of a kind"), // same 3 cards with different plus 2 different cards
    TWO_PAIR("Two Pair"), // 2 sets of the same cards plus an extra card
    ONE_PAIR("One Pair"), // 1 set of the cards plus 2 different cards
    HIGH_CARDS("High Cards"); // without a pair matching a suite

    private final String label;

    Category(String label) {
        this.label = label;
    }
    public String getLabel() {
        return this.label;
    }

}
