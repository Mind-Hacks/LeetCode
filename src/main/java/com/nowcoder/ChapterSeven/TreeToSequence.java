package com.nowcoder.ChapterSeven;

import com.nowcoder.ArrayUtil;
import com.nowcoder.Three.SameTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请用递归方式实现二叉树的先序、中序和后序的遍历打印。
 * 给定一个二叉树的根结点root，
 * 请依次返回二叉树的先序，中序和后续遍历(二维数组的形式)。
 *
 *               1
 *            /  \
 *          2     3
 *        /  \
 *       4    5
 *
 */
public class TreeToSequence {

    public static int[][] convert(TreeNode root) {
        if (root == null) {
            return null;
        }
        int[][] result = new int[3][];                  //返回结果
        List<Integer> res = new ArrayList<Integer>();   //用于遍历的数组

        preOrder(root, res);
        result[0] = copyArrayListToArray(res);
        res.clear();

        inOrder(root, res);
        result[1] = copyArrayListToArray(res);
        res.clear();

        postOrder(root, res);
        result[2] = copyArrayListToArray(res);
        res.clear();

        return result;
    }

    private static int[] copyArrayListToArray(List<Integer> res) {
        int[] temp = new int[res.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = res.get(i);
        }
        return temp;
    }

    private static void preOrder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        int val = node.val;
        res.add(val);
        preOrder(node.left, res);
        preOrder(node.right, res);
    }

    private static void inOrder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inOrder(node.left, res);
        res.add(node.val);
        inOrder(node.right, res);
    }

    private static void postOrder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        postOrder(node.left, res);
        postOrder(node.right, res);
        res.add(node.val);
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

        int[][] result=convert(root);
        ArrayUtil.printDimensionArray(result);
    }
}