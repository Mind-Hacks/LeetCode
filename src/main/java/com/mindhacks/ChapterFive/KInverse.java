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
        ListNode inverseHead = null;
        ListNode tail = null;

        Stack<ListNode> stack = new Stack<ListNode>();
        int pointHead = 0;
        int size = 0;
        while (current != null) {
            //入栈
            while (size < k) {
                if (current == null) {
                   break;
                }
                size++;
                stack.push(current);
                current = current.next;
            }

            if (size != k) {
                while (size != 0) {
                    ListNode popItem = stack.pop();
                    size--;
                    if (size == 0) {
                        tail.next = popItem;
                    }
                }
                break;
            }

            //出栈
            while (size != 0) {
                ListNode popItem = stack.pop();
                size--;
                if (pointHead == 0) {
                    pointHead++;
                    inverseHead = popItem;
                    tail = popItem;
                } else {
                    tail.next = popItem;
                    tail = popItem;
                }
                tail.next=null;
            }

        }
        return inverseHead;
    }

    //0,4,9,11,12,14,20,24
    public static void main(String[] args) {
        ListNode headA = new ListNode(0);
        headA.append(new ListNode(1))
                .append(new ListNode(2))
                .append(new ListNode(5))
                .append(new ListNode(11))
                .append(null);
        ListNode returnHead = inverse(headA, 2);
        ArrayUtil.printNodeList(returnHead);
    }
}