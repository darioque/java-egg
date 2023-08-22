package entities;

public enum Suit {
    SPADES("Spades"), CUPS("Cups"), GOLD("Gold"), CLUBS("Clubs");

    private String value;

    Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
