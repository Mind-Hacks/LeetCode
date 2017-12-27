package com.mindhacks.ChapterFive;
/**
 * 请编写一个函数，检查链表是否为回文。
 * 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 * 测试样例：
 * {1,2,3,2,1}
 * 返回：true
 */

import com.mindhacks.ListNode;

public class Palindrome {
    public static  boolean isPalindrome(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return true;
        }
        //先找到中间节点
        ListNode n1 = pHead;
        ListNode n2 = pHead;
        while (n1 != null && n2 != null &&  n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        //然后拆分成两个链表
        ListNode phead2 = n1.next;
        ListNode tail2 = n2.next;
        n1.next = null;

        ListNode current1 = pHead;
        ListNode current2 = phead2;
        //然后对比链表的各个节点
        while (current1 != null && current2 != null) {
            if (current1.val != current2.val) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

         current1.next=phead2;
        //然后连接旧的节点
        return true;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.append(new ListNode(2))
                .append(new ListNode(3))
                .append(new ListNode(2))
                .append(new ListNode(1))
                .append(null);
        System.out.println(isPalindrome(headA));
    }
}