package chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTrialTest {
    TimeTrial trial;

    @BeforeEach
    void setUp() {
        trial = new TimeTrial();
    }

    @AfterEach
    void tearDown() {
        trial = null;
    }

    @Test
    void testThatHourCanBeSet(){
        int hour = 10;
        trial.setHour(hour);
        assertEquals(10, trial.getHour());
    }

    @Test
    void testThatMinutesCanBeSet(){
        int minute = 45;
        trial.setMinute(minute);
        assertEquals(45, trial.getMinute());
    }
}