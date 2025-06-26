package uk.gov.homeoffice.rpn.exception;

import java.io.Serial;

public final class CalculationException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public CalculationException(String message) {
        super(message);
    }

    public CalculationException(String message, Throwable cause) {
        super(message, cause);
    }

}
