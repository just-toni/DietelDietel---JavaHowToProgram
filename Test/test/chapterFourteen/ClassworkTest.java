package chapterFourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassworkTest {
    Classwork classwork;

    @BeforeEach
    void setUp() {
        classwork = new Classwork();
    }

    @AfterEach
    void tearDown() {
        classwork = null;
    }

    @Test
    void testThatAWordCanBeFoundInASentence(){
        String word = "the";
        String sentence = "The boy went to school and came back late in the evening.";
        int result = Classwork.searchForNumberOfStringOccurrences(sentence,word);
        assertEquals(2, result);
    }

    @Test
    void testThatACharCanBeFoundInAString(){
        char letter = 'h';
        String word = "evening.";
        int result = Classwork.searchForNumberOfCharOccurrences(word, letter);
        assertEquals(0, result);
    }
}