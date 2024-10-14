package ru.pinimini.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        Assertions.assertEquals("",
                longestCommonPrefix.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
        Assertions.assertEquals("fl",
                longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));

    }
}