package game;

import deck.*;
import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int numCards;

    public Player() {
        this.hand = new ArrayList();
        this.numCards = 0;
    }

    /* Get card at the top of the drawing stack */
    public void drawCard(CardDeck drawingStack) {
        Card card = drawingStack.drawCard();
        this.hand.add(card);
    }

    /* Choose a card to play according to the top of the playing stack */
    public void playCard(Card openCard) {
        // Choose which card to play
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public int getNumCards() {
        return this.numCards;
    }
}
