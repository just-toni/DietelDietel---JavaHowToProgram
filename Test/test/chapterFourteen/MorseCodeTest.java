package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    MorseCode morseCode = new MorseCode();

    @Test
    void testThatCovertsMorseCodeToEnglish(){
        String morse = "- .- ... .... .-";
        assertEquals("t a s h a   ", morseCode.toEnglish(morse));
    }

    @Test
    void testThatEnglishConvertsToMorseCode(){
        String phrase = "tasha";
        assertEquals("- .- ... .... .-", morseCode.toMorseCode(phrase));
    }

}