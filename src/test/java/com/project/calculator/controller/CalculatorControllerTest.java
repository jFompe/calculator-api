package com.project.calculator.controller;

import com.project.calculator.model.Operation;
import com.project.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalculatorService calculatorService;

    private static final String BASE_URL = "/calculate";
    public static final String BINARY_OPS_URL = BASE_URL + "/binary";

    @Test
    public void binaryOperationPlus_withCorrectParams_shouldReturnOkResult() throws Exception {
        // Given
        Mockito.when(calculatorService.performBinaryOperation(Mockito.anyInt(), Mockito.any(Operation.class), Mockito.anyInt()))
                .thenReturn(2);

        // When
        ResultActions result = mockMvc.perform(
                get(BINARY_OPS_URL + "?a={a}&b={b}&op={op}", "1", "2", Operation.PLUS.name())
                );

        // Then
        result.andExpect(status().isOk());
        result.andExpect(content().string("2"));
    }

    @Test
    public void binaryOperationMinus_withCorrectParams_shouldReturnOkResult() throws Exception {
        // Given
        Mockito.when(calculatorService.performBinaryOperation(Mockito.anyInt(), Mockito.any(Operation.class), Mockito.anyInt()))
                .thenReturn(2);

        // When
        ResultActions result = mockMvc.perform(
                get(BINARY_OPS_URL + "?a={a}&b={b}&op={op}", "1", "2", Operation.MINUS.name())
        );

        // Then
        result.andExpect(status().isOk());
        result.andExpect(content().string("2"));
    }


}