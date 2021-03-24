package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CAI2Test {

    @Test
    void testThatFirstRandomNumberCanBeGenerated(){
        assertNotEquals(CAI2.generateFirstRandomNumbers(), CAI2.generateFirstRandomNumbers());
    }

    @Test
    void testThatSecondRandomNumberCanBeGenerated(){
        assertNotEquals(CAI2.generateSecondRandomNumber(), CAI2.generateSecondRandomNumber());
    }

    @Test
    void testThatMultiplicationOperatorCanBeGenerated(){
        assertEquals(CAI2.generateFirstRandomNumbers() * CAI2.generateSecondRandomNumber(), CAI2.multiply());
    }

    @Test
    void testThat_programCan_promptUserQuestion(){
        int firstRandom = CAI2.generateFirstRandomNumbers();
        int secondRandom = CAI2.generateSecondRandomNumber();
        assertEquals("How much is " + firstRandom + " times " + secondRandom, CAI2.getQuestion());
    }

    @Test
    void testThat_programCan_getUserAnswer(){
        assertEquals(CAI2.multiply(), CAI2.getStudentAnswer());
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsWrong(){
        int answer = CAI2.multiply() - 4;
        assertEquals("No. Keep trying", CAI2.getFeedbackForIncorrectAnswers(answer));
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsCorrect(){
        int answer = CAI2.multiply();
        assertEquals("Very good", CAI2.getCorrectFeedback(answer));
    }


}