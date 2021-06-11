package Card;

import CardExceptions.StackOverFlowException;
import CardExceptions.StackUnderFlowException;

public class DeckOfCards {
    private Card[] cards;
    private int insertHere;

    public DeckOfCards(int numberOfCards) {
        cards = new Card[numberOfCards];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(Card card) {
        if(isFull()) throw new StackOverFlowException("Deck is full!!!");
        cards[insertHere] = card;
        insertHere++;
    }

    public int getTotalNumberOfCardsInDeck() {
        return insertHere;
    }

    public Card peek() {
        if(isEmpty()) throw new StackUnderFlowException("Deck is empty!!!");
        return cards[insertHere-1];
    }

    public Card pop() {
        if(isEmpty()) throw new StackUnderFlowException("Deck is empty!!!");
        Card cardToReturn = cards[insertHere-1];
        insertHere--;
        return cardToReturn;
    }

    public boolean isEmpty(){
        return getTotalNumberOfCardsInDeck() == 0;
    }

    public boolean isFull(){
        return getTotalNumberOfCardsInDeck() == cards.length;
    }
}
