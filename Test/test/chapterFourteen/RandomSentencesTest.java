package chapterFourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomSentencesTest {
    RandomSentences randomSentences;

    @BeforeEach
    void setUp() {
        randomSentences = new RandomSentences();
    }

    @AfterEach
    void tearDown() {
        randomSentences = null;
    }

    @Test
    void testToRandomiseWordsIntoSentences(){
        String [] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String [] noun = {"boy", "girl", "dog", "town", "car"};
        String [] article = {"the", "a", "one", "some", "any"};
        String [] preposition = {"to", "from", "over", "under", "on"};

        StringBuilder stringBuilder = new StringBuilder();
        randomSentences.randomizingWords();
    }
}