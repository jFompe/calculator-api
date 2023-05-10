package com.project.calculator.configuration;

import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TracerConfiguration {

    // Shouldn't TracerImpl implement TracerAPI ?
    @Bean
    public TracerImpl tracerAPI() {
        return new TracerImpl();
    }

}
