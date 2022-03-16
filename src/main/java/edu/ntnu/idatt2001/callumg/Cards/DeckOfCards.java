package edu.ntnu.idatt2001.callumg.Cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private final char[] suit = { 'S', 'H', 'D', 'C' };
    private List<PlayingCard> cards;

    public DeckOfCards(ArrayList<PlayingCard> cards) {
        this.cards = cards;
    }

    public DeckOfCards() {
        this(new ArrayList<>());
    }

    public ArrayList<PlayingCard> dealHand(int n) {
        ArrayList<PlayingCard> cardsCopy = new ArrayList<>();
        for (PlayingCard card: cards) {
            cardsCopy.add(new PlayingCard(card));
        }
        Random r = new Random();
        int totalCards = cardsCopy.size();
        ArrayList<PlayingCard> randomCards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randomCards.add(cards.get(r.nextInt(totalCards)));
            totalCards = cardsCopy.size();
        }
        return randomCards;
    }
}
