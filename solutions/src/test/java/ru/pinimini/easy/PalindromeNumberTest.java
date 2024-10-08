package ru.pinimini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    PalindromeNumber palindromeNumber = new PalindromeNumber();
    @Test
    void isPalindrome() {
        assertTrue(palindromeNumber.isPalindrome(0));
        assertTrue(palindromeNumber.isPalindrome(1221));
        assertTrue(palindromeNumber.isPalindrome(12321));
        assertTrue(palindromeNumber.isPalindrome(1243421));
        assertTrue(palindromeNumber.isPalindrome(1288821));
        assertTrue(palindromeNumber.isPalindrome(12766721));
        assertFalse(palindromeNumber.isPalindrome(435));
    }
}