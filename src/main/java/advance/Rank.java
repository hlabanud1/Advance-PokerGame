package advance;

public enum Rank {
    TWO("2", 2, 2),
    THREE("3", 3, 3),
    FOUR("4", 4, 4),
    FIVE("5", 5, 5),
    SIX("6", 6, 6),
    SEVEN("7", 7, 7),
    EIGHT("8", 8, 8),
    NINE("9", 9, 9),
    TEN("10", 10, 10),
    JACK("J", 10, 11), // Jack
    QUEEN("Q", 10, 12), // Queen
    KING("K", 10, 13), // King
    ACE("A", 1, 1);  // Ace

    private final String name;
    private final int points;
    private final int rank;
    Rank(String name, int points, int rank) {
        this.name = name;
        this.points = points;
        this.rank = rank;
    }

    // Get the face name of the card
    public String getName() {
        return name;
    }

    public int value() {
        return points;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
