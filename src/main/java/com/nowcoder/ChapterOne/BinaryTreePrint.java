package com.nowcoder.ChapterOne;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by MindHacks on 2017/8/21.
 * 二叉树打印
 *         1
 *     /    \
 *    2     3
 *   /\    / \
 *  4  5  6   7
 *
 */
public class BinaryTreePrint {

    public int[][] printTree(TreeNode root) {
        ArrayList<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();
        ArrayList<TreeNode> level = new ArrayList<TreeNode>();      //遍历当前层
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        TreeNode last = root;
        TreeNode temp = root;
        TreeNode nlast = null;      //下一行的最后一个

        queue.add(root);

        while (queue.size() != 0) {

            temp = queue.poll();
            level.add(temp);

            if (temp.left != null) {
                queue.add(temp.left);
                nlast = temp.left;
            }
            if (temp.right != null) {
                queue.add(temp.right);
                nlast = temp.right;
            }

            if (temp == last) {
                last = nlast;
                result.add(level);
                level = new ArrayList<TreeNode>();
            }

        }

        int[][] results2 = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            results2[i] = new int[result.get(i).size()];
            for (int j = 0; j < results2[i].length; j++) {
                results2[i][j] = result.get(i).get(j).val;
            }
        }

        return results2;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

