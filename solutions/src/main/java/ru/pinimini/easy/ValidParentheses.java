package ru.pinimini.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            boolean b = true;
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char antipod = stack.pop();
                b = ch == getByAntipod(antipod);
            }

            if (!b) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private char getByAntipod(char ch) {
        switch (ch) {
            case '{':
                return '}';
            case '(':
                return ')';
            case '[':
                return ']';
            default:
                return '8';
        }
    }
}
