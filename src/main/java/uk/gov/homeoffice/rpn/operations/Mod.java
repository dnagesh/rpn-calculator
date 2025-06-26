package uk.gov.homeoffice.rpn.operations;

import uk.gov.homeoffice.rpn.core.AbstractBinaryOperation;

public class Mod extends AbstractBinaryOperation {
    @Override
    public String operation() {
        return "mod";
    }
    @Override
    protected double apply(double b, double a) {
        return a % b;
    }
}

