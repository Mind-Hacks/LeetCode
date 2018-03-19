package com.mindhacks.ChapterSeven;

import com.mindhacks.Three.SameTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 有一棵二叉树,请设计一个算法判断它是否是完全二叉树。
 * 给定二叉树的根结点root，请返回一个bool值代表它是否为完全二叉树。\
 * 树的结点个数小于等于500。
 */
public class CheckCompletion {
    public boolean chk(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean flag = true;
        TreeNode cur = null;  //记录遍历的当前节点
        queue.add(root);
        //1、按层遍历每个节点
        //2 、如果有右孩子，没有左孩子，直接返回false
        while (!queue.isEmpty()) {
            cur = queue.poll();
            if (cur.right != null && cur.left == null) {
                return false;
            } else if (cur.left != null && cur.right == null) {
                //3 、如果当前节点只有左孩子，没有右孩子，则之后所有节点必须是叶子节点
                queue.add(cur.left);
                flag = false; //说明当前节点是叶子节点
                continue;
            }
            //当前节点只能是叶子节点，没有左右子树
            if (!flag) {
                if (cur.left != null || cur.right != null) {
                    return false;
                }
            }
            //当前节点是根节点，且有左右字数
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return true;
    }


}