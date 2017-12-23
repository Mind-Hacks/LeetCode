package com.mindhacks.ChapterFive;
/**
 * 有一个单链表，请设计一个算法，使得每K个节点之间逆序，如果最后不够K个节点一组，则不调整最后几个节点。例如链表1->2->3->4->5->6->7->8->null，K=3这个例子。调整后为，3->2->1->6->5->4->7->8->null。因为K==3，所以每三个节点之间逆序，但其中的7，8不调整，因为只有两个节点不够一组。
 * 给定一个单链表的头指针head,同时给定K值，返回逆序后的链表的头指针。
 */

import com.mindhacks.ArrayUtil;
import com.mindhacks.ListNode;

import java.util.List;
import java.util.Stack;

public class KInverse {
    public static ListNode inverse(ListNode head, int k) {
        ListNode current = head;
        ListNode statusNode = head;
        ListNode inverseHead = null;

        Stack<ListNode> stack = new Stack<ListNode>();
        int pointHead = 0;
        int size = 0;
        while (current != null) {
            //进行k个节点之间的连接
            for (int point = 0; point <k; point++) {
                if (statusNode != null) {
                    statusNode = statusNode.next;
                }
            }

            //入栈
            while (size < k) {
                if (current == null) {
                    while (size != 0) {
                        stack.pop();
                        size--;
                    }
                }
                size++;
                stack.push(current);
                current = current.next;
            }

            //出栈
            while (size != 0) {
                ListNode popItem = stack.pop();
                size--;
                if (pointHead == 0) {
                    pointHead++;
                    inverseHead = popItem;
                    current = popItem;
                } else {
                    current.next = popItem;
                    current = popItem;
                }
            }

            current.next = statusNode;
            current = current.next;
        }
        return inverseHead;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.append(new ListNode(2))
                .append(new ListNode(3))
                .append(new ListNode(4))
                .append(new ListNode(5))
                .append(new ListNode(6))
                .append(new ListNode(7))
                .append(new ListNode(8))
                .append(null);
        ListNode returnHead = inverse(headA, 3);
        int[] array = Common.findCommonParts(returnHead, null);
        ArrayUtil.printAyyay(array, args.length);
    }
}