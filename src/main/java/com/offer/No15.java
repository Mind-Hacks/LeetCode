package com.offer;


import com.nowcoder.ListNode;

/**
 * @Description: 输出链表中倒数第k个节点
 * @Author:MindHacks
 * @Date:2018-04-08 22:21:54
 * @wiki:
 */
public class No15 {

    public static void main(String[] args) {

    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode pre = head;
        ListNode last = head;
        for (int i = 1; i < k; i++) {
            if (pre.next != null) {
                pre = pre.next;
            } else {
                return null;
            }
        }
        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last;
    }

}
