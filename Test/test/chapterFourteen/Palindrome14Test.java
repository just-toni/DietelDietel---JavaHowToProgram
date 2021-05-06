package chapterFourteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Palindrome14Test {
    Palindrome14 palindrome14;

    @BeforeEach
    void setUp() {
        palindrome14 = new Palindrome14();
    }

    @Test
    void checkUserInputIsPalindrome(){
        assertTrue(palindrome14.isPalindrome("radar"));
    }


}