package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Deck {
    private LinkedHashSet<Card> cards;
    private List<Card> discardedCards;

    public Deck() {
        cards = new LinkedHashSet<>(40);
        for (Suit suit : Suit.values()) {
            for (Number number : Number.values()) {
                cards.add(new Card(number, suit));
            }
        }
        discardedCards = new ArrayList<>();
    }

    public LinkedHashSet<Card> getCards() {
        return cards;
    }

    public void setCards(LinkedHashSet<Card> cards) {
        this.cards = cards;
    }

    // public String toString() {
    //     String result = "";
    //     for (Card card : cards) {
    //         result += card.toString() + "\n";
    //     }
    //     return result;
    // }

    private void shuffle() {
        List<Card> cardList = new ArrayList<>(cards);
        Collections.shuffle(cardList);
        cards = new LinkedHashSet<>(cardList);
    }

    private Card nextCard() {
        Card card = cards.iterator().next();
        if (cards.remove(card)) {
            discardedCards.add(card); // Add the discarded card to the list
            return card;
        } else {
            System.out.println("There are no more cards in the deck");
            return null;
        }
    }

    public void showDiscardedCards() {
        if (discardedCards.isEmpty()) {
            System.out.println("No cards have been discarded yet.");
        } else {
            for (Card card : discardedCards) {
                System.out.println(card);
            }
        }
    }

    private Integer availableCards() {
        return cards.size();
    }

    public ArrayList<Card> dealHand(Integer numberOfCards) {
        shuffle();
        if (availableCards() < numberOfCards) {
            System.out.println("There are not enough cards in the deck");
            return null;
        }

        ArrayList<Card> hand = new ArrayList<Card>(numberOfCards);
        for (int i = 0; i < numberOfCards; i++) {
            hand.add(nextCard());
        }
        return hand;
    }

    public void showDeck() {
        if (cards.isEmpty()) {
            System.out.println("No cards are in the deck");
        } else {
            for (Card card : cards) {
                System.out.println(card);
            }
        }
    }

}
