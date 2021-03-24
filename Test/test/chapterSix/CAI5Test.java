package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CAI5Test {

    @Test
    void testThatFirstRandomNumberCanBeGenerated(){
        assertNotEquals(CAI5.generateFirstRandomNumbers(), CAI5.generateFirstRandomNumbers());
    }

    @Test
    void testThatSecondRandomNumberCanBeGenerated(){
        assertNotEquals(CAI5.generateSecondRandomNumber(), CAI5.generateSecondRandomNumber());
    }

    @Test
    void testThat_programCan_getUserAnswer(){
        assertEquals(CAI5.getAnswer(), CAI5.getStudentAnswer());
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsWrong(){
        int answer = CAI5.getAnswer() - 4;
        assertEquals("No. Keep trying", CAI5.getFeedbackForIncorrectAnswers(answer));
    }

    @Test
    void testThat_programCan_displayFeedbackWhenAnswerIsCorrect(){
        int answer = CAI5.getAnswer();
        assertEquals("Very good", CAI5.getCorrectFeedback(answer));
    }

    @Test
    void testThat_programCan_displayScoreMessage(){
        assertEquals("Congratulations, you are ready to go to the next level", CAI5.displayScoreMessage());
    }

    @Test
    void testThat_programCan_displayLowScoreMessage(){
        int score = 30;
        assertEquals("Please ask your teacher for extra help", CAI5.displayScoreMessage());
    }

    @Test
    void testThat_programCan_DisplayQuestion(){
        assertEquals(CAI5.generateFirstRandomNumbers() + " " + CAI5.generateRandomOperators() + " " + CAI5.generateSecondRandomNumber(), CAI5.getQuestion());
    }

    @Test
    void testThatUserCanSelectDifficultyLevel(){
        CAI5.generateDifficultyLevel(1);
        int firstNumber = CAI5.generateFirstRandomNumbers();
        int secondNumber = CAI5.generateSecondRandomNumber();
        CAI5.userSelection(1);
        assertEquals(CAI5.getStudentAnswer(), firstNumber + secondNumber);
    }



}