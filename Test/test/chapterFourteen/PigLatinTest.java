package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    @Test
    void testThatWordEnteredReturnsInPigLatinFormat(){
        String word = "open";
        String result = PigLatin.pigLatin(word);
        assertEquals("penoay", result);
    }

    @Test
    void testThatSentenceCanReturnInPigLatinFormat(){
        String sentence = "This way to Bourbon Street";
        assertEquals("histay ayway otay ourbonbay treetsay ", PigLatin.convertSentence(sentence));
    }

}