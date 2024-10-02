package ru.pinimini.medium;

public class AddTwoNumbers {

    public ListNode addTwoNumbers5(ListNode l1, ListNode l2) {
        return sol(l1, l2, 0);
    }

    public static ListNode sol(ListNode l1, ListNode l2, int c) {
        if (l1 == null && l2 == null && c == 0)
            return null;

        int v1 = (l1 != null) ? l1.val : 0;
        int v2 = (l2 != null) ? l2.val : 0;
        int sum = v1 + v2 + c;

        c = sum / 10;
        ListNode n = new ListNode(sum % 10);
        n.next = sol((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, c);
        return n;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (!(l1 == null & l2 == null)) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int resultInt = x + y + carry;
            carry = resultInt / 10;

            current.next = new ListNode(resultInt % 10);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        ListNode resultListNode = null;
        ListNode resultListNode2 = null;
        int tmp = 0;
        int resultInt;
        while (!(l1 == null & l2 == null)) {
            int x = 0;
            int y = 0;
            if (l1 != null) {
                x = l1.val;
            } else {
                l1 = new ListNode(0);
            }
            if (l2 != null) {
                y = l2.val;
            } else {
                l2 = new ListNode(0);
            }

            resultInt = x + y + tmp;
            if (resultInt >= 10) {
                resultInt = resultInt % 10;
                tmp = 1;
            } else {
                tmp = 0;
            }
            resultListNode = new ListNode(resultInt, resultListNode);
            l1 = l1.next;
            l2 = l2.next;
        }
        if (tmp == 1) {
            resultListNode = new ListNode(1, resultListNode);
        }
        while (resultListNode != null) {
            resultListNode2 = new ListNode(resultListNode.val, resultListNode2);
            resultListNode = resultListNode.next;
        }

        return resultListNode2;
    }
}
