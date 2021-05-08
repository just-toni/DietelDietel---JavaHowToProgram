package chapterEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    SavingsAccount savings;

    @BeforeEach
    void setUp() {
        savings = new SavingsAccount();
    }

    @AfterEach
    void tearDown() {
        savings = null;
    }

    @Test
    void testThatSavingsBalanceCanBeLessThanZero(){
        double savingsBalance = -90.0;
        savings.setSavingBalance(savingsBalance);
        assertEquals(0, savings.getSavingsBalance());
    }

    @Test
    void testToCalculateMonthlyInterestRate(){
        double savingsBalance = 750.00;
        double interestRate = 4;
        SavingsAccount.modifyAnnualInterestRate(interestRate);
        assertEquals(4, SavingsAccount.getAnnualInterestRate());
        assertEquals(2.5, savings.calculateMonthlyInterestRate(savingsBalance, interestRate));
    }
}