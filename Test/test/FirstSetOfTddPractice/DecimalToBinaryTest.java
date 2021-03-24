package FirstSetOfTddPractice;

import FirstSetOfTddPractice.DecimalToBinary;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {
    DecimalToBinary conversion;

    @BeforeEach
    void setUp() {
        conversion = new DecimalToBinary();
    }

    @AfterEach
    void tearDown() {
        conversion = null;
    }

    @Test
    @DisplayName("Test to Convert Decimal To Binary")
    void testThatInputCanConvertToBinary(){
        assertEquals(100, conversion.convertInput(100));
    }
}