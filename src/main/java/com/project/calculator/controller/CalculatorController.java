package com.project.calculator.controller;

import com.project.calculator.model.Operation;
import com.project.calculator.service.CalculatorService;
import io.corp.calculator.TracerImpl;
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

    // This should probably be -> private final TracerAPI tracer;
    private final TracerImpl tracer;

    @Autowired
    public CalculatorController(CalculatorService calculatorService, TracerImpl tracer) {
        this.calculatorService = calculatorService;
        this.tracer = tracer;
    }

    private final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping("/binary")
    public ResponseEntity<Integer> binaryOperation(
            @RequestParam Integer a,
            @RequestParam Operation op,
            @RequestParam Integer b
    ) {
        logger.info("CalculatorApi - Performing binary operation {} {} {}", a, op.getSymbol(), b);
        Integer result = calculatorService.performBinaryOperation(a, op, b);
        tracer.trace(result);
        logger.info("CalculatorApi - Returning result: {}", result);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
