package com.Sudoku;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {
    Sudoku sudoku;

    @BeforeEach
    void setUp() {
        sudoku = new Sudoku();
    }

    @AfterEach
    void tearDown() {
        sudoku = null;
    }

    @Test
    void sudokuGame_hasAGrid_test(){
        assertNotNull(sudoku.getBoard());
    }
}