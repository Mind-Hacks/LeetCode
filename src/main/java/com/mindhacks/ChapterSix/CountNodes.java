package com.mindhacks.ChapterSix;


import com.mindhacks.Three.SameTree.TreeNode;

/**
 * 给定一棵完全二叉树的根节点root，返回这棵树的节点个数。
 * 如果完全二叉树的节点数为N，请实现时间复杂度低于O(N)的解法。
 * 给定树的根结点root，请返回树的大小。
 *
 *              1
 *            /  \
 *          2     3
 *        /  \
 *       4    5
 *
 */
public class CountNodes {
    public static int count(TreeNode head) {
        if (head == null) {
            return 0;
        }
        return bs(head, 1, mostLeftLevel(head, 1));
    }


    public static int bs(TreeNode node, int l, int h) {
        if (l == h) {
            return 1;
        }
        if (mostLeftLevel(node.right, l + 1) == h) {
            return (1 << (h - l)) + bs(node.right, l + 1, h);
        } else {
            return (1 << (h - l - 1)) + bs(node.left, l + 1, h);
        }
    }

    public static int mostLeftLevel(TreeNode node, int level) {
        while (node != null) {
            level++;
            node = node.left;
        }
        return level - 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        root.left=treeNode2;
        root.right=treeNode3;

        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;

        System.out.println(count(root));
    }
}