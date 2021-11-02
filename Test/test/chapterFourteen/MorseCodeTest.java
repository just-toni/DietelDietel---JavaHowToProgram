package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    MorseCode morseCode = new MorseCode();

    @Test
    void testThatCovertsMorseCodeToEnglish(){
        String phrase = "tasha";
        assertEquals("- .- ... .... .-", morseCode.toMorseCode(phrase));
    }

}