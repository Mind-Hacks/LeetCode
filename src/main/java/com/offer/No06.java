package com.offer;


import com.nowcoder.ArrayUtil;
import com.nowcoder.ChapterSeven.TreePrinter;

/**
 * @Description: 重建二叉树
 * @Author:MindHacks
 * @Date:2018-04-04 17:46:36
 * @wiki:
 */
public class No06 {


    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 6};
        TreeNode root = reConstructBinaryTree(preorder, inorder);
       /* int[][] result =TreePrinter.printTree(root);
        ArrayUtil.printDimensionArray(result);*/
    }


    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return constructCore(pre, in, 0, pre.length - 1, 0, in.length);
    }

    /**
     * @Description: 遍历递归过程
     * @Param:preOrder 线序遍历结果
     * @Param:in 中序遍历结果
     * @Param:preStart 前序遍历开始位置
     * @Param:preEnd
     * @Param:inStart 中序遍历开始位置
     * @Param:inEnd
     * @Author:MindHacks
     * @Date:2018-04-05 12:03:15
     * @wiki:
     */
    public static TreeNode constructCore(int[] preOrder, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preStart]);
        for (int n = inStart; n < inEnd; n++) {
            if (root.val == in[n]) {
                root.left = constructCore(preOrder, in, preStart + 1, preStart + n - inStart, inStart, inEnd - 1);
                root.right = constructCore(preOrder, in, preStart + n - inStart + 1, preEnd, n + 1, inEnd);
                break;
            }
        }
        return root;
    }

}
