package Stack;

public class DeckOfCards {

    private String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private Card [] deckOfCards = new Card[52];

    public void generateCardDeck() {
        for (int i = 0; i < faces.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                Card card = new Card(faces[i], suits[j]);
                System.out.println(card);
            }
        }
    }

}

//for (int k = 0; k < deckOfCards.length; k++) {
//            for (int i = 0; i < faces.length; i++) {
//                for (int j = 0; j < suits.length; j++) {
//                    Card card = new Card(faces[i], suits[j]);
//                    deckOfCards[k] = card;
//                    System.out.println(deckOfCards[k]);
//                }
//            }
//        }
