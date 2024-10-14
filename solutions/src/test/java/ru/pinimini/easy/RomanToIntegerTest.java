package ru.pinimini.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void romanToInt() {
        Assertions.assertEquals(4, romanToInteger.romanToInt("IV"));
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }
}