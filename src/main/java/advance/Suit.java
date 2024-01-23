package advance;

public enum Suit {

    DIAMONDS("\u2666"),
    CLUBS("\u2663"),
    HEARTS("\u2764"),
    SPADES("\u2660");

    private final String symbol;

    private Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

}
