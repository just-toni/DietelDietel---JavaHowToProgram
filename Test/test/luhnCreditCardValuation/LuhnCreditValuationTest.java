package luhnCreditCardValuation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuhnCreditValuationTest {
    LuhnCreditValuation creditValuation;

    @BeforeEach
    void setUp() {
        creditValuation = new LuhnCreditValuation();
    }

    @AfterEach
    void tearDown() {
        creditValuation = null;
    }

    @Test
    void testToValidateCreditCard(){
        String cardNumber = "4388576018410707";
        String cardNumber2 = "4388576018402626";
        String cardNumber3 = "379354508162306";
        String cardNumber4 = "4440967484181607";
        String cardNumber5 = "4556945214503712";
        String cardNumber6 = "555555545674444";
        String cardNumber7 = "371449635323456";
//        assertFalse(LuhnCreditValuation.isValid(cardNumber2));
//        assertTrue(LuhnCreditValuation.isValid(cardNumber));
//        assertTrue(LuhnCreditValuation.isValid(cardNumber3));
//        assertTrue(LuhnCreditValuation.isValid(cardNumber4));
        assertTrue(LuhnCreditValuation.isValid(cardNumber5));
//        assertTrue(LuhnCreditValuation.isValid(cardNumber6));
//        assertFalse(LuhnCreditValuation.isValid(cardNumber7));
    }
}