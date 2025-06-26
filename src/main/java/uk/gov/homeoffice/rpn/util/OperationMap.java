package uk.gov.homeoffice.rpn.util;

import uk.gov.homeoffice.rpn.core.Operation;
import uk.gov.homeoffice.rpn.operations.*;

import java.util.Map;
import java.util.stream.Stream;
import java.util.function.Function;

public class OperationMap {

    private static final Map<String, Operation> OPERATIONS = Stream.of(
            new Add(), new Subtract(), new Multiply(), new Divide(),
            new Sqrt(), new Sin(), new Cos(), new Avg(), new Mod()
    ).collect(java.util.stream.Collectors.toMap(Operation::operation, Function.identity()));

    public static boolean isSupported(String token) {
        return OPERATIONS.containsKey(token);
    }

    public static Operation get(String token) {
        return OPERATIONS.get(token);
    }
}

