package com.mindhacks.ChapterSeven;


import com.mindhacks.ArrayUtil;
import com.mindhacks.Three.SameTree.TreeNode;

/**
 * 有一棵二叉树，请设计一个算法判断这棵二叉树是否为平衡二叉树。
 * 给定二叉树的根结点root，请返回一个bool值，
 * 代表这棵树是否为平衡二叉树。
 * <p>
 *             1
 *          /  \
 *        2     3
 *      /  \   /
 *    4    5   6
 */
public class CheckBalance {

    public static boolean check(TreeNode root) {
        int deep=chk(root);
        return deep>=0;
    }

    public static int chk(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int leftDept = chk(treeNode.left);
        int rightDept = chk(treeNode.right);
        if (leftDept < 0 || rightDept < 0) {
            return -1;
        }
        if ((Math.abs(leftDept - rightDept)) > 1) {
            return -1;                  //当左右两边深度差超过1，返回-1
        }
        return leftDept > rightDept ? rightDept + 1 : leftDept + 1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);

        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        System.out.println(check(root));
    }
}