package uk.gov.homeoffice.rpn.operations;

import uk.gov.homeoffice.rpn.core.AbstractUnaryOperation;

public class Sin extends AbstractUnaryOperation {
    @Override
    public String operation() {
        return "sin";
    }
    @Override
    protected double apply(double a) {
        return Math.sin(a);
    }
}

