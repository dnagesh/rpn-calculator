package uk.gov.homeoffice.rpn.core;

import java.util.Deque;

public abstract class AbstractBinaryOperation implements Operation {
    @Override public int operandCount() {
        return 2;
    }
    @Override public double apply(Deque<Double> stack) {
        double b = stack.pop();
        double a = stack.pop();
        return apply(a, b);
    }
    protected abstract double apply(double a, double b);
}

