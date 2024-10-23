package ru.pinimini.easy;

import org.junit.jupiter.api.Test;

class ImplementQueueUsingStacksTest {

    @Test
    void queueShouldBeWork() {
        ImplementQueueUsingStacks implementQueueUsingStacks = new ImplementQueueUsingStacks();
        implementQueueUsingStacks.push(1);
        implementQueueUsingStacks.push(2);
        implementQueueUsingStacks.push(3);
        implementQueueUsingStacks.push(4);
        System.out.println(implementQueueUsingStacks.peek());
        System.out.println(implementQueueUsingStacks.pop());
        implementQueueUsingStacks.push(5);
        System.out.println(implementQueueUsingStacks.peek());
    }
}