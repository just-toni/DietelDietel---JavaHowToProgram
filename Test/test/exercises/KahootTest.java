package exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KahootTest {
    Kahoot kahoot;

    @BeforeEach
    void setUp() {
        kahoot = new Kahoot();
    }

    @AfterEach
    void tearDown() {
        kahoot = null;
    }

    @Test
    void kahoot_canCreateQuestions() {
        kahoot.createQuestions();
        kahoot.createQuestions();
        assertEquals(2, kahoot.getTotalNumberOfQuestions());
    }

    @Test
    void kahoot_canDeleteQuestions(){
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        assertEquals(3, kahoot.getTotalNumberOfQuestions());
        kahoot.deleteQuestions(0);
        assertEquals(1, kahoot.getTotalNumberOfQuestions());
    }

    @Test
    void kahoot_cantDeleteNonExistingQuestions(){
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.deleteQuestions(7);
        assertEquals(2, kahoot.getTotalNumberOfQuestions());
    }

    @Test
    void kahoot_canCreateGame(){
        kahoot.createGame(1, 10);
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        kahoot.createQuestions();
        assertEquals(10, kahoot.getTotalNumberOfQuestions());
        assertEquals(1, kahoot.getGame());
    }

    @Test
    void kahoot_canDeleteGame(){
        kahoot.createGame(1, 1);
        kahoot.createQuestions();
        kahoot.createGame(2,1);
        kahoot.createQuestions();
        assertEquals(2, kahoot.getTotalNumberOfQuestions());
        assertEquals(2, kahoot.getGame());
        kahoot.deleteGame(1);
        assertEquals(1, kahoot.getGame());
    }

    @Test
    void kahoot_canCreateQuestionsInAGame(){

    }
}