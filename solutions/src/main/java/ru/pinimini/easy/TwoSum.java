package ru.pinimini.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Solution3
    // O(n)
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mappingTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mappingTable.containsKey(complement)) {
                return new int[]{ mappingTable.get(complement), i};
            }
            mappingTable.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

    //Solution2
    // O(n)
/*    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mappingTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mappingTable.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mappingTable.containsKey(complement) && i != mappingTable.get(complement)) {
                return new int[]{i, mappingTable.get(complement)};
            }
        }
        return new int[]{0, 0};
    }*/

    //Solution1
    // O(n^2)
/*    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }*/
}
