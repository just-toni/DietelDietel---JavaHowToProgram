package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CAI4Test {

    @Test
    void testThatFirstRandomNumberCanBeGenerated(){
        assertNotEquals(CAI4.generateFirstRandomNumbers(), CAI4.generateFirstRandomNumbers());
    }

    @Test
    void testThatSecondRandomNumberCanBeGenerated(){
        assertNotEquals(CAI4.generateSecondRandomNumber(), CAI4.generateSecondRandomNumber());
    }

    @Test
    void testThatMultiplicationOperatorCanBeGenerated(){
        assertEquals(CAI4.generateFirstRandomNumbers() * CAI4.generateSecondRandomNumber(), CAI4.multiply());
    }

    @Test
    void testThat_programCan_promptUserQuestion(){
        int firstRandom = CAI4.generateFirstRandomNumbers();
        int secondRandom = CAI4.generateSecondRandomNumber();
        assertEquals("How much is " + firstRandom + " times " + secondRandom, CAI4.getQuestion());
    }

    @Test
    void testThat_programCan_getUserAnswer(){
        assertEquals(CAI3.multiply(), CAI4.getStudentAnswer());
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsWrong(){
        int answer = CAI4.multiply() - 4;
        assertEquals("No. Keep trying", CAI4.getFeedbackForIncorrectAnswers(answer));
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsCorrect(){
        int answer = CAI4.multiply();
        assertEquals("Very good", CAI4.getCorrectFeedback(answer));
    }

    @Test
    void testThat_programCan_displayScoreMessage(){
        assertEquals("Congratulations, you are ready to go to the next level", CAI4.displayScoreMessage());
    }

    @Test
    void testThat_programCan_displayLowScoreMessage(){
        int score = 30;
        assertEquals("Please ask your teacher for extra help", CAI4.displayScoreMessage());
    }

    @Test
    void testThat_programCan_haveDifferentDifficultyLevels(){

    }

}