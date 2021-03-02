package com.realdolmen.samples.johndoe.lambdas;

import java.util.function.DoubleBinaryOperator;

public enum Operation_Lambdas {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation_Lambdas(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }

    @Override
    public String toString() {
        return symbol;
    }
}
