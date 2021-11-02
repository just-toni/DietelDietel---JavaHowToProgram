package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalysisTest {

    TextAnalysis textAnalysis = new TextAnalysis();

    @Test
    void numberOfOccurrencesTest1(){
        String text = "To be, or not to be: that is the question";
        textAnalysis.findNumberOfOccurrencesOfEachAlphabetInThisText(text);
    }

}