package ru.pinimini.medium;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder firstIntString = new StringBuilder();
        StringBuilder secondIntString = new StringBuilder();
        while (l1 != null) {
            firstIntString.append(l1.val);
            l1 = l1.next;
        }
        Integer firstInt = Integer.parseInt(firstIntString.reverse().toString());

        while (l2 != null) {
            secondIntString.append(l2.val);
            l2 = l2.next;
        }

        Integer secondInt = Integer.parseInt(secondIntString.reverse().toString());
        Integer result = firstInt + secondInt;
        String resultString = new StringBuilder(result.toString()).toString();
        ListNode previousListNode = null;

        for (char ch : resultString.toCharArray()) {
            previousListNode = new ListNode(Integer.parseInt(String.valueOf(ch)), previousListNode);
        }
        return previousListNode;
    }
}
