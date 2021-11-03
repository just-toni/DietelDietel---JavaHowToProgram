package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalysisTest {

    @Test
    void numberOfOccurrencesTest1(){
        String text = "To be, or not to be: that is the question";
        assertEquals("""
                a            1
                b            2
                c            0
                d            0
                e            4
                f            0
                g            0
                h            2
                i            2
                j            0
                k            0
                l            0
                m            0
                n            2
                o            5
                p            0
                q            1
                r            1
                s            2
                t            6
                u            1
                v            0
                w            0
                x            0
                y            0
                z            0
                """, TextAnalysis.findNumberOfOccurrencesOfEachAlphabetInThisText(text));
    }

}