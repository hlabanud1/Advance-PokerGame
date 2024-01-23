package advance;

public enum Category {

    STRAIGHT_FLUSH("Straight Flush"), //Contains 5 cards of sequential rank involving the same suit e.g. 6♥, 7♥, 8♥, 9♥, 10♥
    FOUR_OF_A_KIND("Four of a Kind"), //Contains 4 cards that are the same rank e.g. 9♣ 9♠ 9♦ 9♥ J♥
    FULL_HOUSE("Full House"), //Contains 2 cards of one rank, 3 cards of another rank e.g. K♣ K♠ K♦ J♣ J♠
    FLUSH("Flush"), //Contains 5 cards that have the same suit e.g. K♦ J♦ 9♦ 6♦ 4♦
    STRAIGHT("Straight"), //Contains 5 cards of sequential rank that don't have the same suit throughout e.g. 7♣ 6♠ 5♠ 4♥ 3♥
    THREE_OF_A_KIND("Three of a kind"), //Contains 3 cards that are the same rank e.g. 2♦ 2♠ 2♣ K♠ 6♥
    TWO_PAIR("Two Pair"), //Contains 2 cards of one rank, 2 cards of another rank and 1 card of another rank e.g. J♥ J♣ 4♣ 4♠ 9♥
    ONE_PAIR("One Pair"), //Contains 2 cards that are the same rank while the other cards are varying ranks e.g. 4♥ 4♠ K♠ 10♦ 5♠
    HIGH_CARDS("High Cards"); //Contains pair with no matching suite e.g. K♠ 10♦ 9♦ 2♣ A♥,

    private final String label;

    Category(String label) {
        this.label = label;
    }
    public String getLabel() {
        return this.label;
    }

}
