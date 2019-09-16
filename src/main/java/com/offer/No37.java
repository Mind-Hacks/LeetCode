package com.offer;

import com.nowcoder.ListNode;

/**
 * @description: 两个链表的第一个公共节点
 * @author:MindHacks
 * @wiki:
 */
public class No37 {

    public ListNode getLineSameNode(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return null;
        }

        int length1 = getLength(head1);
        int length2 = getLength(head2);
        if (length1 - length2 > 0) {
            int temp = length1 - length2;
            while (temp != 0) {
                head1 = head1.next;
                temp--;
            }
            while (length2 != 0) {
                if (head1 == head2)
                    return head1;
                head1 = head1.next;
                head2 = head2.next;
                length2--;
            }
        } else if (length2 - length1 > 0) {
            int temp = length2 - length1;
            while (temp != 0) {
                head2 = head2.next;
                temp--;
            }
            while (length1 != 0) {
                if (head1 == head2)
                    return head1;
                head1 = head1.next;
                head2 = head2.next;
                length1--;
            }
        } else {
            if (head1 == head2)
                return head1;
        }
        return null;
    }

    public int getLength(ListNode node) {
        int length = 0;
        ListNode temp = node;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}
