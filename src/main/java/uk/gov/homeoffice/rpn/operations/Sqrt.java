package uk.gov.homeoffice.rpn.operations;

import uk.gov.homeoffice.rpn.core.AbstractUnaryOperation;

public class Sqrt extends AbstractUnaryOperation {
    @Override
    public String operation() {
        return "sqrt";
    }
    @Override
    protected double apply(double a) {
        return Math.sqrt(a);
    }
}

