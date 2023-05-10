package com.project.calculator.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryOperationsTest {

    private final BinaryOperations binaryOperations = new BinaryOperations();

    @Test
    public void sum_withNumericParams_shouldReturnCorrectResult() {
        assertEquals(5, binaryOperations.sum(3, 2));
        assertEquals(0, binaryOperations.sum(0, 0));
        assertEquals(0, binaryOperations.sum(-1, 1));
        assertEquals(1, binaryOperations.sum(3, -2));
        assertEquals(-5, binaryOperations.sum(-3, -2));
    }

    @Test
    public void subtract_withNumericParams_shouldReturnCorrectResult() {
        assertEquals(1, binaryOperations.subtract(3, 2));
        assertEquals(0, binaryOperations.subtract(0, 0));
        assertEquals(-2, binaryOperations.subtract(-1, 1));
        assertEquals(5, binaryOperations.subtract(3, -2));
        assertEquals(-1, binaryOperations.subtract(-3, -2));
    }

}