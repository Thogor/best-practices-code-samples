package com.realdolmen.samples.lennertVandenHerrewegen.streams_lambdas;

import java.util.Collections;
import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("+", (x, y) -> x + y),

    MINUS("-", (x, y) -> x - y),

    TIMES("*", (x, y) -> x * y),

    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;

    private final DoubleBinaryOperator op;


    Operation(String symbol, DoubleBinaryOperator op) {

        this.symbol = symbol;

        this.op = op;

    }
}
