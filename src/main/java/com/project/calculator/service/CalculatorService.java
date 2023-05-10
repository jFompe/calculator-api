package com.project.calculator.service;

import com.project.calculator.model.Operation;
import com.project.calculator.operation.BinaryOperations;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final BinaryOperations binaryOperations;

    public CalculatorService(BinaryOperations binaryOperations) {
        this.binaryOperations = binaryOperations;
    }

    public Integer performBinaryOperation(Integer a, Operation op, Integer b) {
        return switch (op) {
            case PLUS -> binaryOperations.sum(a, b);
            case MINUS -> binaryOperations.subtract(a, b);
        };
    }

}
