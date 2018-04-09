package com.offer;


/**
 * @Description: 二叉树的镜像
 * @Author:MindHacks
 * @Date:2018-04-09 20:48:10
 * @wiki:
 */
public class No19 {

    public static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        TreeNode temp=null;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }

}
