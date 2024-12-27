package com.mtgs.dsa.datastructure;

import java.util.HashMap;
import java.util.Stack;

public class PostfixConverter {

    HashMap<Character, Integer> precedences = new HashMap<>();

    PostfixConverter() {
        this.precedences.put('+', 1);
        this.precedences.put('-', 1);

        this.precedences.put('*', 2);
        this.precedences.put('/', 2);
    }

    boolean isHigherOrEqual(char firstOperator, char secondOperator) {
        int firstPrecedence = this.precedences.get(firstOperator);
        int secondPrecedence = this.precedences.get(secondOperator);
        return firstPrecedence >= secondPrecedence;
    }

    boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    boolean isParentheses(char ch) {
        return ch == '(' || ch == ')';
    }

    boolean isOperand(char ch) {
        return !isOperator(ch) && !isParentheses(ch);
    }

    public String toPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        String postfix = "";
        for (char ch : infix.toCharArray()) {
            if (isOperand(ch)) {
                postfix += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (this.isOperator(ch)) {
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    // pop all the operator on stack when second operator is greater or equal
                    while (!stack.isEmpty() && stack.peek() != '(' && this.isHigherOrEqual(stack.peek(), ch)) {
                        postfix += stack.pop();
                    }
                    if (!stack.isEmpty() && stack.peek() != '(') {
                        stack.push(ch);
                    } else {
                        stack.push(ch);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }
        return postfix;
    }
}
