package ru.pinimini.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    void twoSumTest() {
        int[] nums = {2,5,4};
        int[] actual = twoSum.twoSum(nums, 6);
        Assertions.assertArrayEquals(new int[]{0, 2}, actual);
    }
}