package uk.gov.homeoffice.rpn.core;

import java.util.Deque;

public abstract class AbstractUnaryOperation implements Operation {
    @Override
    public int operandCount() {
        return 1;
    }
    @Override
    public double apply(Deque<Double> stack) {
        return apply(stack.pop());
    }
    protected abstract double apply(double value);
}

