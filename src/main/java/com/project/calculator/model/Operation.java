package com.project.calculator.model;

public enum Operation {
    PLUS('+'),
    MINUS('-');

    private final char symbol;

    private Operation(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

}
