package ru.pinimini.easy;

import org.junit.jupiter.api.Test;

class ImplementStackUsingQueuesTest {

    @Test
    void testMyStack() {

        ImplementStackUsingQueues implementStackUsingQueues = new ImplementStackUsingQueues();
        implementStackUsingQueues.push(1);
        implementStackUsingQueues.push(2);
        implementStackUsingQueues.push(3);
        implementStackUsingQueues.push(4);
        System.out.println(implementStackUsingQueues.top());
        implementStackUsingQueues.push(5);
        System.out.println(implementStackUsingQueues.pop());
        System.out.println(implementStackUsingQueues.top());
        System.out.println(implementStackUsingQueues.pop());
        System.out.println(implementStackUsingQueues.pop());
        System.out.println(implementStackUsingQueues.top());
        implementStackUsingQueues.empty();
    }
}