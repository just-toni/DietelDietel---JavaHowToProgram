package chapterEight;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    Board  board;
    TicTacToe game;

    @BeforeEach
    void setUp() {
        board = new Board(3);
        game = new TicTacToe(board);
    }

    @AfterEach
    void tearDown() {
        board = null;
        game = null;
    }

    @Test
    void testThatAGameHasABoard(){
        assertNotNull(game.getBoard());
    }

    @Test
    void testThatABoardHasAGrid(){
        assertNotNull(board.getGrid());
    }

    @Test
    void testThatBoardCanBeVisualized(){
        assertEquals("""
                p p p
                p p p
                p p p
                """, game.displayBoard());
    }
}