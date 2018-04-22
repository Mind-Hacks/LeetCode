package com.offer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 从上往下打印二叉树
 * @Author:MindHacks
 * @Date:2018-04-22 11:07:02
 * @wiki: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class No23 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList arrayList = new ArrayList();
        if (root == null) {
            return arrayList;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
            arrayList.add(treeNode.val);
        }
        return arrayList;
    }
}
