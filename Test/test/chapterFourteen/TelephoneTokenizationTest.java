package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneTokenizationTest {

    @Test
    void testThatATelephoneNumberCanBeReturnedAsNumbers(){
        String phoneNumber = "(562) 809-5720";
        assertEquals("5628095720", TelephoneTokenization.changeNumber(phoneNumber));
    }

}