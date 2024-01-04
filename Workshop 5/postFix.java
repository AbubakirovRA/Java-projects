/**
 * task1
 * задание: Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
 * Написать программу на Java вычисляющую значение сложного арифметического выражения. Для простоты - выражение всегда вычисляемое
 * Пример: (2^3 * (10 / (5 - 3)))^(Sin(Pi)) ответ - 1
 */

import java.util.Stack;

public class InfixToPostfix {
    
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

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Discard the '('
                }
            } else {
                while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static double evaluatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push((double) (ch - '0'));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        if (operand2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(operand1 / operand2);
                        break;
                    case '^':
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

    public static void main(String[] args) {
        String infixExpression = "(2^3*(10/(5-3)))^(Math.sin(Math.PI))";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + postfixExpression);

        double result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
}
