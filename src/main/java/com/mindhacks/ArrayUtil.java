package com.mindhacks;

/**
 * 数组常用操作
 */
public class ArrayUtil {

    //交换数组的值
    public static void changeValue(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    //打印数组
    public static void printAyyay(int A[], int length) {
        System.out.print("[");
        for (int n = 0; n < length - 1; n++) {
            System.out.print(A[n] + ",");
        }
        System.out.println(A[length - 1] + "]");
    }

    /**
     * @Description:打印链表节点
     * @Param:node
     * @Author:mindHacks
     * @Date:2017-12-24 23:12:07
     * @wiki:
     */
    public static void printNodeList(ListNode node) {
        System.out.print("{");
        while (node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println("}");
    }
}
