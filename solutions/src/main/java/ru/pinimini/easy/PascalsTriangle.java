package ru.pinimini.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    //Решение с помощью рекурсии + мемоизация (Нисходящее DP)
/*    private static Map<Integer, List<Integer>> cache = new HashMap<>();

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            if (cache.containsKey(i)) {
                result.add(cache.get(i));
            } else {
                List<Integer> sum = getSum(i);
                result.add(sum);
                cache.put(i, sum);
            }
        }
        return result;
    }

    List<Integer> getSum(int n) {
        List<Integer> currentList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                currentList.add(1);
            } else if (i == n - 1) {
                currentList.add(1);
            } else {
                List<Integer> previousResultList;
                if (cache.containsKey(n - 1)) {
                    previousResultList = cache.get(n - 1);
                } else {
                    List<Integer> sum = getSum(n - 1);
                    previousResultList = sum;
                    cache.put(n - 1, sum);
                }

                int sum = previousResultList.get(i - 1) + previousResultList.get(i);
                currentList.add(sum);
            }
        }
        return currentList;
    }*/

    //Решение с помощью рекурсии (Нисходящее DP)
    // Временная сложность O(n^3)???
/*    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            result.add(getSum(i));
        }
        return result;
    }

    List<Integer> getSum(int n) {
        List<Integer> currentList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                currentList.add(1);
            } else if (i == n - 1) {
                currentList.add(1);
            } else {
                List<Integer> previousResultList = getSum(n - 1);
                int sum = previousResultList.get(i - 1) + previousResultList.get(i);
                currentList.add(sum);
            }
        }
        return currentList;
    }*/

    //Решение с помощью восходящего DP через цикл
    // Сложность по времени = O(n^2)
    // Сложность по памяти = O(n^2)
/*    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> initialList = List.of(1);
        List<Integer> previousList = List.of(0, 1, 0);
        result.add(initialList);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> currentList = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    currentList.add(1);
                } else if (j == i - 1) {
                    currentList.add(1);
                } else {
                    currentList.add(previousList.get(j - 1) + previousList.get(j));
                }
            }
            result.add(currentList);
            previousList = currentList;
        }
        return result;
    }*/

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            arr.add(cal(i));
        }

        return arr;
    }

    public List<Integer> cal(int row) {
        int result = 1;
        List<Integer> nums = new ArrayList<>();
        nums.add(result);

        for (int i = 1; i < row; i++) {
            result *= row - i;
            result /= i;
            nums.add(result);
        }

        return nums;
    }
}
