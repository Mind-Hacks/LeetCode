package com.nowcoder.ChapterFive;

import com.nowcoder.ListNode;

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
        ListNode left = null;
        ListNode leftTail = null;
        ListNode right = null;
        ListNode rightTail = null;
        int leftPoint = 0;
        int rightPoint = 0;
        while (current != null) {
            if (current.val < val) {
                if (leftPoint == 0) {
                    left = current;
                    leftTail = current;
                    leftPoint++;
                } else {
                    leftTail.next = current;
                    leftTail = current;
                }
            } else {
                if (rightPoint == 0) {
                    right = current;
                    rightTail = current;
                    rightPoint++;
                } else {
                    rightTail.next = current;
                    rightTail = current;
                }
            }
            current = current.next;
        }
        if (left == null) {
            return right;
        }
        rightTail.next = null;
        leftTail.next = right;
        return left;
    }


}