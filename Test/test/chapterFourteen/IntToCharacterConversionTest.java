package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToCharacterConversionTest {

    IntToCharacterConversion intToCharacterConversion = new IntToCharacterConversion();

    @Test
    void convertIntToCharacterTest(){
        int code = 68;
        Character answer = 'D';
        assertEquals(answer, intToCharacterConversion.convertIntToCharacter(code));
    }

}