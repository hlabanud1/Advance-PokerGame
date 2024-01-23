package advance;

public enum Suit {

    DIAMONDS("\u2666"),
    CLUBS("\u2663"),
    HEARTS("\u2764"),
    SPADES("\u2660");

    private final String value;

    private Suit(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
