package uk.gov.homeoffice.rpn.operations;

import uk.gov.homeoffice.rpn.core.AbstractUnaryOperation;

public class Cos extends AbstractUnaryOperation {
    @Override
    public String operation() {
        return "cos";
    }
    @Override
    protected double apply(double a) {
        return Math.cos(a);
    }
}

