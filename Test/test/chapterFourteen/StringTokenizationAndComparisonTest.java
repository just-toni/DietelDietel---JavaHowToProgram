package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTokenizationAndComparisonTest {

    StringTokenizationAndComparison stringTokenizationAndComparison;

    @Test
    void testThatSentenceCanBeTokenized(){
        String sentence = "This must be the bird in Bessie's bedroom in Baldin";
        stringTokenizationAndComparison.tokenizeSentence(sentence);
        String answer = "be bird Bessie's bedroom Baldin";
        assertEquals(answer, stringTokenizationAndComparison.getTokenizedSentence());
    }

}