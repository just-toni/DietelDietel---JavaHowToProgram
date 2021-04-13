package Stack;

public class DeckOfCards {

    private String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private Card [] deckOfCards = new Card[52];

    public void generateCardDeck() {
        for (int k = 0; k < deckOfCards.length; k++) {
            for (int i = 0; i < faces.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    Card card = new Card(faces[i], suits[j]);
                    deckOfCards[k] = card;
                    System.out.println(card);
                }
            }
        }
    }

//    deck = new Card[NUMBER_OF_CARDS];
//
//    int counter = 0;
//        for (int i = 0; i < suits.length; i++) {
//        for (int j = 0; j < faces.length; j++) {
//            deck[counter] = new Card(faces[j], suits[i]);
//            counter++;
//            System.out.println(deck[counter]);
//        }
//        System.out.println();
//    }

//        for (int i = 0; i < faces.length; i++) {
//            for (int j = 0; j < suits.length; j++) {
//                Card card = new Card(faces[i], suits[j]);
//                System.out.println(card);
//            }
//        }


}


