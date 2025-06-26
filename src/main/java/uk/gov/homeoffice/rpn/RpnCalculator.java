package uk.gov.homeoffice.rpn;

import uk.gov.homeoffice.rpn.core.ReversePolishNotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Maze class represents the maze.
 */
public class RpnCalculator {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("provide input file name");
        }

        String resourceName = args[0];
        ReversePolishNotation rpn = new ReversePolishNotation();

        try (var in = RpnCalculator.class.getClassLoader().getResourceAsStream(resourceName)) {
            if (in == null) {
                System.out.println("Input file not found in resources: " + resourceName);
                return;
            }

            try (var reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
                reader.lines()
                        .filter(line -> !line.isBlank())
                        .map(e -> rpn.calculate(e))
                        .forEach(System.out::println);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

}
