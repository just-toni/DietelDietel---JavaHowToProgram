package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMethodsTest {

    StringMethods stringMethods = new StringMethods();

    @Test
    void indexOfTest(){
        String dummy = "Qwertyyuiop";
        int answer = stringMethods.indexOf(dummy, "yuiop");
        assertEquals(6, answer);
    }

    @Test
    void lastIndexOfTest(){
        String dummy = "Qwertyyuiopijqqewq";
        int answer = stringMethods.lastIndexOf(dummy, "qqewq");
        assertEquals(14, answer);
    }

}