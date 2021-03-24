package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CAI3Test {

    @Test
    void testThatFirstRandomNumberCanBeGenerated(){
        assertNotEquals(CAI3.generateFirstRandomNumbers(), CAI3.generateFirstRandomNumbers());
    }

    @Test
    void testThatSecondRandomNumberCanBeGenerated(){
        assertNotEquals(CAI3.generateSecondRandomNumber(), CAI3.generateSecondRandomNumber());
    }

    @Test
    void testThatMultiplicationOperatorCanBeGenerated(){
        assertEquals(CAI3.generateFirstRandomNumbers() * CAI3.generateSecondRandomNumber(), CAI3.multiply());
    }

    @Test
    void testThat_programCan_promptUserQuestion(){
        int firstRandom = CAI3.generateFirstRandomNumbers();
        int secondRandom = CAI3.generateSecondRandomNumber();
        assertEquals("How much is " + firstRandom + " times " + secondRandom, CAI3.getQuestion());
    }

    @Test
    void testThat_programCan_getUserAnswer(){
        assertEquals(CAI3.multiply(), CAI3.getStudentAnswer());
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsWrong(){
        int answer = CAI3.multiply() - 4;
        assertEquals("No. Keep trying", CAI3.getFeedbackForIncorrectAnswers(answer));
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsCorrect(){
        int answer = CAI3.multiply();
        assertEquals("Very good", CAI3.getCorrectFeedback(answer));
    }

    @Test
    void testThat_programCan_displayScoreMessage(){
        assertEquals("Congratulations, you are ready to go to the next level", CAI3.displayScoreMessage());
    }

    @Test
    void testThat_programCan_displayLowScoreMessage(){
        int score = 30;
        assertEquals("Please ask your teacher for extra help", CAI3.displayScoreMessage());
    }

}