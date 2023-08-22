import java.util.ArrayList;

import entities.Card;
import entities.Deck;

public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();

        System.out.println("Initial deck:");
        deck.showDeck();

        System.out.println("\nDealing 5 cards...");
        ArrayList<Card> hand = deck.dealHand(5);

        System.out.println("\nHand:");
        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println("\nDeck after dealing:");
        deck.showDeck();

        System.out.println("\nDiscarded cards:");
        deck.showDiscardedCards();

    }
}
