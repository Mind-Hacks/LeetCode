package com.offer;


import com.nowcoder.ListNode;

import java.util.List;

/**
 * @Description: O(1)时间内删除链表节点
 * @Author:MindHacks
 * @Date:2018-04-08 21:19:59
 * @wiki:
 */
public class No13 {

    public static void main(String[] args) {

    }

    public  void   deleteNodeFromList(ListNode deleteNode,ListNode head){
        if (deleteNode.val==head.val){
            head.next=head.next.next;
            return;
        }
        ListNode current=head;
        ListNode preNode=current;
        while (current.val!=deleteNode.val){
            preNode=current;
            current=current.next;
        }
        preNode.next=current.next;
        current.next=null;

    }

}
