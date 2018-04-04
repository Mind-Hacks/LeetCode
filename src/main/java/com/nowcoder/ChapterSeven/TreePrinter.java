package com.nowcoder.ChapterSeven;

import com.nowcoder.ArrayUtil;
import com.nowcoder.Three.SameTree.TreeNode;

import java.util.ArrayList;

/**
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 * 给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
 * 所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
 *
 *               1
 *            /  \
 *          2     3
 *        /  \
 *       4    5
 */
public class TreePrinter {

    public static int[][] printTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        levelTraverse(root, 1, res);
        int[][] ans = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = new int[res.get(i).size()];
            for (int j = 0; j < res.get(i).size(); j++) {
                ans[i][j] = res.get(i).get(j);
            }
        }
        return ans;
    }

    public static void levelTraverse(TreeNode root, int level, ArrayList<ArrayList<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() < level) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level - 1).add(root.val);
        levelTraverse(root.left, level + 1, res);
        levelTraverse(root.right, level + 1, res);
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

        int[][] result = printTree(root);
        ArrayUtil.printDimensionArray(result);
    }
}