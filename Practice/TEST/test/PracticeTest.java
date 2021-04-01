import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {
Practice practice;

    @BeforeEach
    void setUp() {
        practice = new Practice();
    }

    @AfterEach
    void tearDown() {
        practice = null;
    }


}