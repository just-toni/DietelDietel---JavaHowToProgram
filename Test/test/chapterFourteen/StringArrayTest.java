package chapterFourteen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayTest {
    StringArray stringArray;

    @BeforeEach
    void setUp() {
        stringArray = new StringArray();
    }

    @AfterEach
    void tearDown() {
        stringArray = null;
    }

    @Test
    void testThatAStringCanBeReversed(){
        stringArray.reverseString("685755465");
        assertEquals("8790", stringArray.getReservedString());
    }

    @Test
    void reverseString(){
        String init = "685755465 234";
        StringBuilder reversed = new StringBuilder(init.substring(init.length()-3));
        reversed.append(") ");
        reversed.insert(0, "(+");

        int count = 0;
        for (int i = init.length() - 5; i >= 0; i--) {
            System.out.println(count % 3 + " " + count);
//            if(count == 3){
//                count = 0;
//                reversed.append("-");
//            }
            if(count % 3 == 0 && count > 0){
                reversed.append("-");
            }
            reversed.append(init.charAt(i));
            count++;
        }
        System.out.println(reversed);
    }
}