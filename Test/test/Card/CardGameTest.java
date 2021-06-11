package Card;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {

    @Test
    void cardGameCanBeCreated(){
        CardGame cardGame = new CardGame(2, 5);
        assertNotNull(cardGame);
    }

    @Test
    void cardGameIsInitialiseWithNumberOfPlayers(){
        CardGame cardGame = new CardGame(2, 5);
        assertEquals(2, cardGame.getNumberOfPlayers());
    }

    @Test
    void cardGameIsInitialiseWithNumberOfCardsToDeal(){
        CardGame cardGame = new CardGame(2, 5);
        assertEquals(5, cardGame.getNumberOfCardsToDeal());
    }

    @Test
    void cardGameCanShuffleCardDeck(){
    }
}