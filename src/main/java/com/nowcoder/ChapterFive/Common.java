package com.nowcoder.ChapterFive;

import com.nowcoder.ArrayUtil;
import com.nowcoder.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 现有两个升序链表，且链表中均无重复元素。请设计一个高效的算法，打印两个链表的公共值部分。
 * 给定两个链表的头指针headA和headB，请返回一个vector，元素为两个链表的公共部分。
 * 请保证返回数组的升序。两个链表的元素个数均小于等于500。保证一定有公共值
 * 测试样例：
 * {1,2,3,4,5,6,7},{2,4,6,8,10}
 * 返回：[2.4.6]
 */
public class Common {
    public static int[] findCommonParts(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;

        List<Integer> list = new ArrayList<Integer>();
        while (currentA != null && currentB != null) {
            if (currentA.val < currentB.val) {
                currentA = currentA.next;
            } else if (currentA.val > currentB.val) {
                currentB = currentB.next;
            } else {
                list.add(currentA.val);
                currentA = currentA.next;
                currentB = currentB.next;
            }
        }
        if (list.size() == 0) {
            return null;
        }
        int[] res = new int[list.size()];
        for (int n = 0; n < list.size(); n++) {
            res[n] = list.get(n);
        }
        return res;
    }


    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.append(new ListNode(2))
                .append(new ListNode(3))
                .append(new ListNode(4))
                .append(new ListNode(5))
                .append(new ListNode(6))
                .append(new ListNode(7))
                .append(null);

        ListNode headB = new ListNode(2);
        headB.append(new ListNode(4))
                .append(new ListNode(6))
                .append(new ListNode(8))
                .append(new ListNode(10))
                .append(null);

        int[] result = findCommonParts(headA, headB);
        ArrayUtil.printAyyay(result, result.length);
    }
}