package com.project.calculator.configuration;

import com.project.calculator.operation.BinaryOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OperationConfiguration {

    @Bean
    public BinaryOperations binaryOperations() {
        return new BinaryOperations();
    }

}
