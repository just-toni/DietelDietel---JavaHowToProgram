package Card;

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
        cards[insertHere] = card;
        insertHere++;
    }

    public int getTotalNumberOfCardsInDeck() {
        return insertHere;
    }

    public Card peek() {
        return cards[--insertHere];
    }

    public Card pop() {
        Card cardToReturn = cards[insertHere-1];
        insertHere--;
        return cardToReturn;
    }
}
