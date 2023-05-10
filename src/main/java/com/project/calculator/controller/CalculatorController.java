package com.project.calculator.controller;

import com.project.calculator.model.Operation;
import com.project.calculator.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    private final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping("/binary")
    public ResponseEntity<Integer> binaryOperation(
            @RequestParam Integer a,
            @RequestParam Operation op,
            @RequestParam Integer b
    ) {
        logger.info("CalculatorApi - Performing operation {} {} {}", a, op.getSymbol(), b);
        Integer result = calculatorService.performBinaryOperation(a, op, b);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
