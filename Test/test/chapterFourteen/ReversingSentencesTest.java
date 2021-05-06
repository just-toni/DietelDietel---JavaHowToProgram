package chapterFourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingSentencesTest {
    ReversingSentences reverse;

    @BeforeEach
    void setUp() {
        reverse = new ReversingSentences();
    }

    @AfterEach
    void tearDown() {
        reverse = null;
    }

    @Test
    void testThatASentenceCanBeReversed(){
        String sentence = "This is a boy";
        String result = reverse.reverseInput(sentence);
        assertEquals("boy a is This ", result);
    }
}