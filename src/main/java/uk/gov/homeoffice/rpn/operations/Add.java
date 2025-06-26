package uk.gov.homeoffice.rpn.operations;

import uk.gov.homeoffice.rpn.core.AbstractBinaryOperation;

public class Add extends AbstractBinaryOperation {
    @Override
    public String operation() {
        return "+";
    }
    @Override
    protected double apply(double a, double b) {
        return a + b;
    }
}

