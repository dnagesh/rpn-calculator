package uk.gov.homeoffice.rpn.core;

import uk.gov.homeoffice.rpn.exception.CalculationException;
import uk.gov.homeoffice.rpn.util.OperationMap;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotation {

    public String calculate(String line) {

        if (line == null || line.trim().isBlank()) return "";

        String[] tokens = line.strip().split("\\s+");
        Deque<Double> stack = new ArrayDeque<>();

        try {
            for (String token : tokens) {
                if (OperationMap.isSupported(token)) {
                    Operation operation = OperationMap.get(token);

                    if (stack.size() < operation.operandCount()) {
                        throw new CalculationException("Not Reverse Polish Notation try backwards");
                    }

                    stack.push(operation.apply(stack));
                } else {
                    stack.push(parseNumber(token));
                }
            }

            return stack.size() == 1
                    ? formatResult(line, stack.pop())
                    : formatError(line, "- Not Reverse Polish Notation try backwards");

        } catch (CalculationException | NumberFormatException e) {
            return formatError(line,  e instanceof NumberFormatException
                    ? "Not Reverse Polish Notation try backwards"
                    : e.getMessage());
        }
    }

    private double parseNumber(String token) {
        return Double.parseDouble(token);
    }

    private String formatResult(String expression, double result) {
        return "%s = %.2g".formatted(expression, result);
    }

    private String formatError(String expression, String message) {
        return "%s - %s".formatted(expression, message);
    }
}
