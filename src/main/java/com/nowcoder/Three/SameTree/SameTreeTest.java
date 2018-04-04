package com.nowcoder.Three.SameTree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by MindHacks on 2017/8/8.
 */
public class SameTreeTest {
    private static Logger logger = LoggerFactory.getLogger(SameTreeTest.class);

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        root.left = treeNode2;
        root.right = treeNode3;
        treeNode2.right = treeNode4;
        treeNode3.right = treeNode5;
        treeNode4.left = treeNode6;


        TreeNode zroot = new TreeNode(1);
        TreeNode ztreeNode2 = new TreeNode(2);
        TreeNode ztreeNode3 = new TreeNode(3);
        TreeNode ztreeNode4 = new TreeNode(4);
        TreeNode ztreeNode5 = new TreeNode(5);
        TreeNode ztreeNode6 = new TreeNode(6);

        zroot.left = ztreeNode2;
        zroot.right = ztreeNode3;
        ztreeNode2.right = ztreeNode4;
        ztreeNode3.right = ztreeNode5;
        ztreeNode4.left = ztreeNode6;
        logger.info("SameTreeTest是否是同一棵树;{}", new Solution().isSameTree(root, zroot));
    }
}
