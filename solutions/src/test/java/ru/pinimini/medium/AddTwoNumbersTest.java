package ru.pinimini.medium;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode listNodeLast = new ListNode(3, null);
    ListNode listNode2 = new ListNode(4, listNodeLast);
    ListNode listNodeFirst = new ListNode(2, listNode2);

    ListNode iterListNode = listNodeFirst;

    ListNode listNodeLast2 = new ListNode(4, null);
    ListNode listNode22 = new ListNode(6, listNodeLast2);
    ListNode listNodeFirst2 = new ListNode(5, listNode22);

    @Test
    void addTwoNumbers() {
        ListNode resultNode = addTwoNumbers
                .addTwoNumbers(listNodeFirst, listNodeFirst2);


        while (resultNode != null) {
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }

        //Assertions.assertIterableEquals(result, List.of(8,9,9,9,0,0,0,1));
    }
/*    @Test
    void addTwoNumbers2() {
        List<Integer> result = addTwoNumbers
                .addTwoNumbers(new LinkedList<>(List.of(2,4,3)), new LinkedList<>(List.of(5,6,4)));
        Assertions.assertIterableEquals(result, List.of(7,0,8));
    }*/
}