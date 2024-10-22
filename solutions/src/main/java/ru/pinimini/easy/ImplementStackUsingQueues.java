package ru.pinimini.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

    Queue<Integer> firstQueue = new LinkedList<>();
    Queue<Integer> secondQueue = new LinkedList<>();

    public void push(int x) {

        secondQueue.offer(x);
        while (!firstQueue.isEmpty()) {
            secondQueue.offer(firstQueue.poll());
        }
        Queue<Integer> temp = firstQueue;
        firstQueue = secondQueue;
        secondQueue = temp;
    }

    public int pop() {
        return firstQueue.poll();
    }

    public int top() {
        return firstQueue.peek();
    }

    public boolean empty() {
        return firstQueue.isEmpty();
    }
}


