package com.mindhacks;

/**
 * @Description:自定义列表node节点
 * @Author:mindHacks
 * @Date:2017年12月23日15:26
 * @wiki:
 */
public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }


    /**
     * @Description: 构造链表
     * @Param:listNode
     * @Param:next
     * @Author:mindHacks
     * @Date:2017年12月23日15:33
     * @wiki:
     */
    public ListNode append(ListNode next) {
        this.next = next;
        return next;
    }
}