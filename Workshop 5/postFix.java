/**
 * task1
 * задание: Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
 * Написать программу на Java вычисляющую значение сложного арифметического выражения. Для простоты - выражение всегда вычисляемое
 * Пример: (2^3 * (10 / (5 - 3)))^(Sin(Pi)) ответ - 1
 */
import java.util.*;

interface MathFunction {
    double apply(double arg);
}

public class Calculator {

    private static final Map<String, MathFunction> FUNCTIONS = Map.of(
            "sin", Math::sin,
            "cos", Math::cos,
            "tan", Math::tan
    );

    public static void main(String[] args) {
        String infixExpression = "(2^3 * (10 / (5 - 3)))^(sin(0))";

        try {
            String postfixExpression = infixToPostfix(infixExpression);
            System.out.println("Infix: " + infixExpression);
            System.out.println("Postfix: " + postfixExpression);

            double result = evaluatePostfix(postfixExpression);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    private static boolean isFunction(String token) {
        return FUNCTIONS.containsKey(token.toLowerCase());
    }

    private static List<String> tokenize(String expression) {
        List<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || ch == '.') {
                token.append(ch);
            } else if (ch == '(' || ch == ')' || isOperator(ch)) {
                processToken(tokens, token);
                tokens.add(String.valueOf(ch));
            } else if (ch == ' ') {
                processToken(tokens, token);
            } else {
                throw new IllegalArgumentException("Invalid character in expression: " + ch);
            }
        }

        processToken(tokens, token);

        return tokens;
    }

    private static void processToken(List<String> tokens, StringBuilder token) {
        if (token.length() > 0) {
            tokens.add(token.toString());
            token.setLength(0);
        }
    }

    public static String infixToPostfix(String infix) {
        List<String> tokens = tokenize(infix);
        Stack<String> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            if (Character.isDigit(token.charAt(0)) || Character.isLetter(token.charAt(0))) {
                postfix.append(token).append(" ");
            } else if (isFunction(token)) {
                stack.push(token);
            } else if (isOperator(token.charAt(0))) {
                while (!stack.isEmpty() && isOperator(stack.peek().charAt(0)) &&
                        getPrecedence(token.charAt(0)) <= getPrecedence(stack.peek().charAt(0))) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postfix.append(stack.pop()).append(" ");
                }
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();  // Discard the '('
                } else {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek().equals("(")) {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            postfix.append(stack.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    public static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = postfix.split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            if (Character.isDigit(token.charAt(0))) {
                stack.push(Double.parseDouble(token));
            } else if (isFunction(token)) {
                if (stack.size() < 1) {
                    throw new IllegalArgumentException("Invalid expression");
                }
                double arg = stack.pop();
                MathFunction function = FUNCTIONS.get(token.toLowerCase());
                double result = function.apply(arg);
                stack.push(result);
            } else if (isOperator(token.charAt(0))) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression");
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(operand1 / operand2);
                        break;
                    case "^":
                        stack.push(Math.pow(operand1, operand2));
                        break;
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return stack.pop();
    }
}

