package com.project.calculator.service;

import com.project.calculator.model.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer performBinaryOperation(Integer a, Operation op, Integer b) {
        return switch (op) {
            case PLUS -> a + b;
            case MINUS -> a - b;
        };
    }

}
