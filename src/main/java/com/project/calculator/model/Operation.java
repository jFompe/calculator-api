package com.project.calculator.model;

public enum Operation {
    PLUS('+'),
    MINUS('-');

    private final char symbol;

    Operation(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

}
