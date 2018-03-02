package com.mindhacks.ChapterSeven;

import com.mindhacks.ArrayUtil;
import com.mindhacks.Three.SameTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 请用非递归方式实现二叉树的先序、中序和后序的遍历打印。
 * 给定一个二叉树的根结点root，请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 */

/**
 * @Description:非递归二叉树进行遍历
 * @Author:MindHacks
 * @Date:2018-03-01 16:10:14
 * @wiki: 1
 * /  \
 * 2     3
 * /  \
 * 4    5
 */
public class TreeToSequenceNew {


    public static int[][] convert(TreeNode root) {
        // write code here
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> in = new ArrayList<Integer>();
        List<Integer> post = new ArrayList<Integer>();
        preOrder(root, pre);
        inOrder(root, in);
        postOrder(root, post);
        int[][] res = new int[3][pre.size()];
        for (int i = 0; i < pre.size(); i++) {
            res[0][i] = pre.get(i);
            res[1][i] = in.get(i);
            res[2][i] = post.get(i);
        }
        return res;
    }

    public static void preOrder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            list.add(cur.val);
            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }
    }

    public static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
    }

    public static void postOrder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode h = root, c = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            c = stack.peek();
            if (c.left != null && (c.left != h && c.right != h)) {
                stack.push(c.left);
                c = c.left;
            } else if (c.right != null && c.right != h) {
                stack.push(c.right);
                c = c.right;
            } else {
                h = c;
                TreeNode tmp = stack.pop();
                list.add(tmp.val);
            }
        }
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

        int[][] result = convert(root);
        ArrayUtil.printDimensionArray(result);
    }
}
