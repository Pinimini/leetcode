package ru.pinimini.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    void twoSumTest() {
        int[] nums = {3,3};
        int[] actual = twoSum.twoSum(nums, 6);
        Arrays.stream(actual).forEach(System.out::print);
        Assertions.assertArrayEquals(new int[]{0, 1}, actual);
    }
}