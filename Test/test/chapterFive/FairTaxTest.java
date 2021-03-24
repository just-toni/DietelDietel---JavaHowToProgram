package chapterFive;

import chapterFive.FairTax;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairTaxTest {
    FairTax tax;

    @BeforeEach
    void setUp() {
        tax = new FairTax();
    }

    @AfterEach
    void tearDown() {
        tax = null;
    }

    @Test
    void testThatExpensesCanBeCollected(){
        tax.setExpenses(80.0);
        assertEquals(80.0, tax.getTotalExpenses());
    }

    @Test
    void testThatNegativeValuesForExpensesCantBeCollected(){
        tax.setExpenses(-80.0);
        assertEquals(0.0, tax.getTotalExpenses());
    }

    @Test
    void testThatTotalExpensesCanBeCollected(){
        tax.setExpenses(80.0);
        tax.setExpenses(50.0);
        tax.setExpenses(100.0);
        assertEquals(230.0, tax.getTotalExpenses());
    }

    @Test
    void testThatTaxCanBeCalculatedOnTotalExpense(){
        double result = tax.calculateTax();
        assertEquals(0.0, result);
    }
}