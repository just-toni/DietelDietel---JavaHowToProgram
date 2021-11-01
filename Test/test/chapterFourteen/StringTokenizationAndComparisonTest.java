package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTokenizationAndComparisonTest {

    StringTokenizationAndComparison stringTokenizationAndComparison = new StringTokenizationAndComparison();

    @Test
    void testThatSentenceCanBeTokenized(){
        String sentence = "This must be the bird in Bessie's bedroom in Baldin";
        String answer = "be bird Bessie's bedroom Baldin";
        assertEquals(answer, stringTokenizationAndComparison.tokenizeSentence(sentence));
    }

    @Test
    void testThatSentenceCanBeTokenized2(){
        String sentence = "There are no word with ED other than startED";
        String answer = "ED startED";
        assertEquals(answer, stringTokenizationAndComparison.tokenizeSentence(sentence));
    }

}