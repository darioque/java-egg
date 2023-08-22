package entities;

public class Card {
    private Number number;
    private Suit suit;

    public Card(Number number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public Number getNumber() {
        return number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String toString() {
        return number.toString() + " of " + suit.toString();
    }
}
