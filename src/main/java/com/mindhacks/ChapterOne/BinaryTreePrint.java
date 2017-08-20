package com.mindhacks.ChapterOne;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by MindHacks on 2017/8/21.
 * <p>
 * 二叉树打印
 */
public class BinaryTreePrint {
    public int[][] printTree(TreeNode root) {
        if (root==null){
            return  null;
        }
        Queue queue=new LinkedList();
        queue.add(root);
        if (!queue.isEmpty()){
            int size=queue.size();
        }
        return  null;
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
