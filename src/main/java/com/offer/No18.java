package com.offer;



/**
 * @Description: 判断树的子结构
 * @Author:MindHacks
 * @Date:2018-04-09 12:07:24
 * @wiki:
 */
public class No18 {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {

            if (root1.val == root2.val) {  //如果根节点相同
                result = doesTree1HaveTree2(root1, root2);
            }
            if (!result) {
                result = HasSubtree(root1.left, root2);
            }
            if (!result) {
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;
    }

    public static boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
        if (node2 == null) {   //第一次调用 node2 不可能为空
            return true;
        }
        if (node1 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return doesTree1HaveTree2(node1.left, node2.left) && doesTree1HaveTree2(node1.right, node2.right);
    }
}
