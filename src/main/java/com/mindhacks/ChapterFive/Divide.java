package com.mindhacks.ChapterFive;

/**
 * 对于一个链表，我们需要用一个特定阈值完成对它的分化，使得小于等于这个值的结点移到前面，大于该值的结点在后面，同时保证两类结点内部的位置关系不变。
 * 给定一个链表的头结点head，同时给定阈值val，请返回一个链表，使小于等于它的结点在前，大于等于它的在后，保证结点值不重复。
 * 测试样例：
 * {1,4,2,5},3
 * {1,2,4,5}
 */


public class Divide {
    public static ListNode listDivide(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode leftTail = head;
        ListNode right = null;
        ListNode rightTail = head;
        int ponit = 0;
        while (current != null) {
            if (current.val < val) {
                leftTail.next = current;
                leftTail = current;
            } else {
                if (ponit == 0) {
                    right = current;
                    rightTail = current;
                    ponit++;
                } else {
                    rightTail.next = current;
                    rightTail = current;
                }
            }
            current = current.next;
        }
        leftTail.next = right;
        return head;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(7);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        listDivide(listNode1, 5);
        ListNode current = listNode1;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }
    }
}