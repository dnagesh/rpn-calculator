package uk.gov.homeoffice.rpn.operations;

import uk.gov.homeoffice.rpn.core.AbstractBinaryOperation;

public class Multiply extends AbstractBinaryOperation {
    @Override
    public String operation() {
        return "*";
    }
    @Override
    protected double apply(double b, double a) {
        return a * b;
    }
}

