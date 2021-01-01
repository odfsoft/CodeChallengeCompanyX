package com.odfsoft.companies.y;

import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiFunction;

public class Calc {

    public static final Character EXPR_SEPARATOR = ' ';
    public static final Character DOUBLE_SEPARATOR = '.';

    private final Map<String, BiFunction<String, String, Double>> operationMap =
            Map.of(
                    "+", (String opA, String opB) -> Double.valueOf(opB) + Double.valueOf(opA),
                    "-", (String opA, String opB) -> Double.valueOf(opB) - Double.valueOf(opA),
                    "*", (String opA, String opB) -> Double.valueOf(opB) * Double.valueOf(opA),
                    "/", (String opA, String opB) -> Double.valueOf(opB) / Double.valueOf(opA)

            );

    /**
     * Calculator which evaluates expressions in Reverse Polish notation.
     * Implementation is based on the stack algorithm in:
     * https://en.wikipedia.org/wiki/Reverse_Polish_notation#Postfix_evaluation_algorithm
     *
     * @param expr String
     *             Expect to always have spaces.
     *             Valid operations are +, -, *, /
     *             Empty expression should evaluate to 0
     *             0 0 / is not expected
     *             There should be always two preecend operands for each operation.
     * .               f.e. 1 + 3 not allowed
     * @return result double
     */
    public double evaluate(String expr) {
        if (expr.isEmpty()) {
            return 0;
        }
        for (char token : expr.toCharArray()) {
            if (isAllowedCharacter(token)) {
                //Promote to error depending on expected behaviour
                throw new IllegalArgumentException(String.format("Unexpected character in expression: %s", expr));
            }
        }

        LinkedList<String> tokenStack = new LinkedList<>();
        for (String token : expr.split(EXPR_SEPARATOR.toString())) {
            if (operationMap.containsKey(token)) {
                tokenStack.push(
                        operationMap.get(token).apply(tokenStack.pop(), tokenStack.pop())
                                .toString());
            } else {
                tokenStack.push(token);
            }
        }

        double result = Double.valueOf(tokenStack.pop());
        return result;
    }

    private boolean isAllowedCharacter(char token) {
        return !Character.isDigit(token) && !operationMap.containsKey(Character.toString(token)) && token != EXPR_SEPARATOR && token != DOUBLE_SEPARATOR;
    }

}
