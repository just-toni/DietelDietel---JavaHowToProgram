package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperAndLowerCaseTest {

    @Test
    void testToConvertStringToUpperAndLowerCase(){
        String word = "KiTe";
        assertEquals("Lower case format of the word is kite\n" +
                "Upper case format of the word is KITE", UpperAndLowerCase.changeCase(word));
    }

}