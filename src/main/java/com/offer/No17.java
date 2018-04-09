package com.offer;


import com.nowcoder.ListNode;

/**
 * @Description: 合并两个排序的链表
 * @Author:MindHacks
 * @Date:2018-04-09 11:26:45
 * @wiki:
 */
public class No17 {

    public static void main(String[] args) {

    }


    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
