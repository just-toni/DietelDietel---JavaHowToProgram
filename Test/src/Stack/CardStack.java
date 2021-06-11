//package Stack;
//
//public class CardStack {
//    private Card[] element;
//    private int writeHere;
//    DeckOfCards deck;
//
//    public CardStack(int i) {
//        element = new Card[i];
//        deck.generateCardDeck();
////        deck.displayCards();
//    }
//
//    public void push(Card card) {
//        deck.generateCardDeck();
//        if(isFull()) throw  new  StackOverflowError("Stack is full");
//        element[writeHere] = card;
//        writeHere++;
//    }
//
//    public Card peek() {
//        return element[writeHere-1];
//    }
//
//    public Card pop() {
//        if(isEmpty()) throw new IllegalArgumentException("Empty stack");
//        Card elementToReturn = element[writeHere-1];
//        writeHere--;
//        return elementToReturn;
//    }
//
//    public int getTotalNumberOfElement() {
//        return writeHere;
//    }
//
//    public boolean isEmpty() {
//        if (getTotalNumberOfElement() == 0) return true;
//        else return false;
//    }
//
//    public boolean isFull() {
//        if(element.length == getTotalNumberOfElement())
//            return true;
//        else
//            return false;
//    }
//
//
//}
