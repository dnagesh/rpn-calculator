package uk.gov.homeoffice.rpn.operations;

import uk.gov.homeoffice.rpn.core.AbstractBinaryOperation;

public class Avg extends AbstractBinaryOperation {
    @Override
    public String operation() {
        return "avg";
    }
    @Override
    protected double apply(double b, double a) {
        return (a + b)/2;
    }
}

