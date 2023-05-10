package com.project.calculator.service;

import com.project.calculator.model.Operation;
import com.project.calculator.operation.BinaryOperations;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer performBinaryOperation(Integer a, Operation op, Integer b) {
        return switch (op) {
            case PLUS -> BinaryOperations.sum(a, b);
            case MINUS -> BinaryOperations.subtract(a, b);
        };
    }

}
