package uk.gov.homeoffice.rpn;

import org.junit.jupiter.api.Test;
import uk.gov.homeoffice.rpn.core.ReversePolishNotation;

import static org.junit.jupiter.api.Assertions.*;

class RpnCalculatorTest {

    ReversePolishNotation rpn = new ReversePolishNotation();

    @Test
    void testAddition() {
        String result = rpn.calculate("1.0 2.0 +");
        String[] parts = result.split(" = ");
        double actual = Double.parseDouble(parts[1]);
        assertEquals(3.0, actual);

    }

    @Test
    void testMultiplication() {
        String result = rpn.calculate("3 4 *");
        String[] parts = result.split(" = ");
        double actual = Double.parseDouble(parts[1]);
        assertEquals(12.0, actual);

    }

    @Test
    void testMultipleOperandsMultiplySubAndSqrt() {
        String result = rpn.calculate("6 3 * 2 - sqrt");
        String[] parts = result.split(" = ");
        double actual = Double.parseDouble(parts[1]);
        assertEquals(4.0, actual);

    }

    @Test
    void testNotReversePolishNotation() {
        String result = rpn.calculate("(5 + 3) * 2");
        String[] parts = result.split(" - ");
        assertEquals("Not Reverse Polish Notation try backwards", parts[1]);
    }

    @Test
    void testNotReversePolishNotation2() {
        String result = rpn.calculate("1 + 1");
        String[] parts = result.split(" - ");
        assertEquals("Not Reverse Polish Notation try backwards", parts[1]);
    }

}