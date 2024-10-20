package ru.pinimini.easy;

public class ClimbingStairs {

    //Решение с помощью цикла for и табуляции
    // Сложность по времени O(n)
    //Сложность по памяти O(n)
    public int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int element = 1;
        int nextElement = 2;

        for (int i = 2; i < n; i++) {
            int newNext = element + nextElement;
            element = nextElement;
            nextElement = newNext;
        }

        return nextElement;
    }



    //Решение с помощью рекурсии с использованием мемоизации
    // Сложность по времени O(n)
    //Сложность по памяти O(n)
/*    private  static final Map<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(1, 1);
        cache.put(2, 2);
    }

    public int climbStairs(int n) {
        if (!cache.containsKey(n)) {
            int result = climbStairs(n - 1) + climbStairs(n - 2);
            cache.put(n, result);
        }

        return cache.get(n);
    }*/
}
