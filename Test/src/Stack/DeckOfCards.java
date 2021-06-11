package Stack;

import static chapterSeven.RollDie.secureRandom;

public class DeckOfCards {

    private String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private Card [] deckOfCards = new Card[52];

    public Card generateCardDeck(){
        Card card = null;
        for (int i = 0; i < faces.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                card = new Card(faces[i], suits[j]);
                System.out.println(card);
            }
        }
        return card;
    }



//    public Card generateCardDeck() {
//        Card card = null;
//        for (int k = 0; k < deckOfCards.length; k++) {
//            card = new Card(faces[k % faces.length], suits[k / faces.length]);
//            deckOfCards[k] = card;
//        }
//        return deckOfCards[deckOfCards];
//    }
//    public void displayCards(){
//        for (int i = 0; i < deckOfCards.length; i++) {
//            System.out.println(deckOfCards[i]);
//        }
//    }

}


