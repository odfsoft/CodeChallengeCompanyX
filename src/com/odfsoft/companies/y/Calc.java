package com.odfsoft.companies.y;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Calc {

    public static final Character EXPR_SEPARATOR = ' ';
    public static final Character DOUBLE_SEPARATOR = '.';

    private final Set<String> operations = new HashSet<>() {{
        add("+");
        add("-");
        add("*");
        add("/");
    }};

    public double evaluate(String expr) {
        if (expr.isEmpty()) {
            return 0;
        }

        Stack<Double> tokens = new Stack<>();
        for (String token : expr.split(" ")) {
            if (operations.contains(token)) {
                Double resolvedOperation = resolveOperation(token, tokens.pop(), tokens.pop());
                tokens.push(resolvedOperation);
            } else {
                tokens.push(Double.parseDouble(token));
            }
        }

        return tokens.pop();
    }

    public Double resolveOperation(String op, Double first, Double second) {
        switch (op) {
            case "+": return second + first;
            case "-": return second - first;
            case "*": return second * first;
            case "/": return second / first;
            default:
                throw new IllegalArgumentException(String.format("Unexpected character operation in expression: %s", op));
        }
    }

}
