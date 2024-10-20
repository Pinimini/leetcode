package ru.pinimini.easy;

import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void generate() {
        pascalsTriangle.generate(15).forEach(System.out::println);
    }
}