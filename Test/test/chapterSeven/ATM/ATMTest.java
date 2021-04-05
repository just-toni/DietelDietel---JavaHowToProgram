package chapterSeven.ATM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ATMTest {
    ATM kuda;

    @BeforeEach
    void setUp() {
        kuda = new ATM();
    }

    @AfterEach
    void tearDown() {
        kuda = null;
    }

    @Test
    void testThatATMCanBeCreated(){
        assertNotNull(kuda);
    }

    @Test
    void testThatAccountCanBeCreated(){

    }
}