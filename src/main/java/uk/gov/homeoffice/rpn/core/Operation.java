package uk.gov.homeoffice.rpn.core;

import java.util.Deque;

public interface Operation {
    String operation();
    int operandCount();
    double apply(Deque<Double> stack);
}

