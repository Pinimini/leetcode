package ru.pinimini.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();

        Assertions.assertTrue(validParentheses.isValid("{}"));
        Assertions.assertTrue(validParentheses.isValid("{()}"));
        Assertions.assertTrue(validParentheses.isValid("{([])}"));
        Assertions.assertTrue(validParentheses.isValid("{}[]"));
        Assertions.assertFalse(validParentheses.isValid("{}([]"));
        Assertions.assertFalse(validParentheses.isValid("]"));
    }
}