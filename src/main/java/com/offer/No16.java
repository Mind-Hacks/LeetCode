package com.offer;


import com.nowcoder.ListNode;

/**
 * @Description: 反转链表
 * @Author:MindHacks
 * @Date:2018-04-09 11:11:46
 * @wiki:
 */
public class No16 {

    public static void main(String[] args) {

    }

    public ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
            next=head.next; //保存下一个节点

            head.next=pre;  //改变指针指向

            pre=head;
            head=next;
        }
        return  pre;
    }
}
