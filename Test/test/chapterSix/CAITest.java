package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CAITest {

    @Test
    void testThatFirstRandomNumberCanBeGenerated(){
        assertNotEquals(CAI.generateFirstRandomNumbers(), CAI.generateFirstRandomNumbers());
    }

    @Test
    void testThatSecondRandomNumberCanBeGenerated(){
        assertNotEquals(CAI.generateSecondRandomNumber(), CAI.generateSecondRandomNumber());
    }

    @Test
    void testThatMultiplicationOperatorCanBeGenerated(){
        assertEquals(CAI.generateFirstRandomNumbers() * CAI.generateSecondRandomNumber(), CAI.multiply());
    }

    @Test
    void testThat_programCan_promptUserQuestion(){
        int firstRandom = CAI.generateFirstRandomNumbers();
        int secondRandom = CAI.generateSecondRandomNumber();
        assertEquals("How much is " + firstRandom + " times " + secondRandom, CAI.getQuestion());
    }

    @Test
    void testThat_programCan_getUserAnswer(){
        assertEquals(CAI.multiply(), CAI.getStudentAnswer());
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsWrong(){
        int answer = CAI.multiply() - 4;
        assertEquals("No. Please try again.", CAI.getFeedback(answer));
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsCorrect(){
        int answer = CAI.multiply();
        assertEquals("Very good!", CAI.getFeedback(answer));
    }

}