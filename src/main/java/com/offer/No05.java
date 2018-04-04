package com.offer;

import com.nowcoder.ListNode;

import java.util.ArrayList;

/**
 * @Description:链表打印
 * @Author:MindHacks
 * @Date:2018-04-04 17:02:28
 * @wiki:
 */
public class No05 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
        ArrayList<Integer> arrayList=printListFromTailToHead(listNode1);
        for (Integer ter:arrayList) {
            System.out.println(ter);
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        printListFromEnd(arrayList, listNode);
        return arrayList;
    }


    private static void printListFromEnd(ArrayList list, ListNode listNode) {
        if (listNode != null) {
            printListFromEnd(list, listNode.next);
            list.add(listNode.val);
        }
    }
}
