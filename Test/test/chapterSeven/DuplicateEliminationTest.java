package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    @Test
    void input_isWithinGivenRange_test(){
        DuplicateElimination.checkInput(17);
//        assertEquals(17, DuplicateElimination.getInput());
    }

    @Test
    void testUniqueInputsCanBeDisplayed(){
        DuplicateElimination.checkInput(45);
        DuplicateElimination.checkInput(56);
        DuplicateElimination.checkInput(77);
        DuplicateElimination.checkInput(65);
        assertEquals("45, 56, 77, 65, ", DuplicateElimination.displayUniqueInputs());
    }


}