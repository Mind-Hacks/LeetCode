package com.nowcoder.Second.MaximumDepthofBinaryTree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @User MindHacks
 * @Date 2017/8/7 21:08
 * @Version 1.0.0
 */

/**
 *
 *                1
 *             /     \
 *            2       3
 *           \         \
 *            4         5
 *           /
 *          6
 */
public class MaximumDepthofBinaryTreeTest {
    private static Logger logger = LoggerFactory.getLogger(MaximumDepthofBinaryTreeTest.class);

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);
        TreeNode treeNode5=new TreeNode(5);
        TreeNode treeNode6=new TreeNode(6);

        root.left=treeNode2;
        root.right=treeNode3;
        treeNode2.right=treeNode4;
        treeNode3.right=treeNode5;
        treeNode4.left=treeNode6;
        logger.info("MaximumDepthofBinaryTreeTest的深度;{}",new SelfSolution().maxDepth(root));
    }
}
