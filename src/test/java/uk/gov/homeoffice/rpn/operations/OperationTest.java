package uk.gov.homeoffice.rpn.operations;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void testAvg() {
        var avg = new Avg();
        Deque<Double> stack = stackOf(4.0, 8.0);
        double result = avg.apply(stack);
        assertEquals(6.0, result);
    }

    @Test
    void testMod() {
        var mod = new Mod();
        Deque<Double> stack = stackOf(10.0, 3.0);
        double result = mod.apply(stack);
        assertEquals(1.0, result);
    }

    @Test
    void testSin() {
        var sin = new Sin();
        Deque<Double> stack = stackOf(Math.PI / 2);
        double result = sin.apply(stack);
        assertEquals(1.0, result);
    }

    @Test
    void testCos() {
        var cos = new Cos();
        Deque<Double> stack = stackOf(Math.PI); // cos(π) = -1
        double result = cos.apply(stack);
        assertEquals(-1.0, result, 0.00001);
    }

    private static Deque<Double> stackOf(double... values) {
        Deque<Double> stack = new ArrayDeque<>();
        for (int i = values.length - 1; i >= 0; i--) {
            stack.push(values[i]);
        }
        return stack;
    }
}

