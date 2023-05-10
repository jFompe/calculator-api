package com.project.calculator.service;

import com.project.calculator.model.Operation;
import com.project.calculator.operation.BinaryOperations;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorServiceTest {

    private final BinaryOperations binaryOperations = Mockito.mock(BinaryOperations.class);

    private final CalculatorService calculatorService = new CalculatorService(binaryOperations);

    @Test
    public void plusBinaryOperation_shouldCallSum_withCorrectOperands() {
        Integer a = 1, b = 2;
        calculatorService.performBinaryOperation(a, Operation.PLUS, b);
        Mockito.verify(binaryOperations).sum(a, b);
    }

    @Test
    public void minusBinaryOperation_shouldCallSubtract_withCorrectOperands() {
        Integer a = 1, b = 2;
        calculatorService.performBinaryOperation(a, Operation.MINUS, b);
        Mockito.verify(binaryOperations).subtract(a, b);
    }

}