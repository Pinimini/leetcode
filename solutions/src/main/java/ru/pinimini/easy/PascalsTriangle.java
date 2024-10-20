package ru.pinimini.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
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
    }

    //Решение с помощью рекурсии (Нисходящее DP)
    // Временная сложность O()
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
}
