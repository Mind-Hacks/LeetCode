package com.nowcoder.ChapterFive;

import com.nowcoder.ArrayUtil;
import com.nowcoder.ListNode;

/**
 * 现在有一个单链表。链表中每个节点保存一个整数，再给定一个值val，把所有等于val的节点删掉。
 * 给定一个单链表的头结点head，同时给定一个值val，请返回清除后的链表的头结点，
 * 保证链表中有不等于该值的其它值。请保证其他元素的相对顺序。
 * 测试样例：
 * 测试样例：
 {1,2,3,4,3,2,1},2
 {1,3,4,3,1}
 */
public class ClearValue {
    public static  ListNode clear(ListNode head, int val) {
        ListNode pre = null;
        ListNode current = head;
        if (current == null) {
            return null;
        }
        while (current != null) {
            if (current.val == val) {
                if (current == head) {
                    head = head.next;
                } else {
                    pre.next=current.next;
                }
            }else {
                pre = current;
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.append(new ListNode(2))
                .append(new ListNode(3))
                .append(new ListNode(4))
                .append(new ListNode(3))
                .append(new ListNode(2))
                .append(new ListNode(1))
                .append(null);
        ListNode head=clear(headA,2);
        ArrayUtil.printNodeList(head);
    }
}