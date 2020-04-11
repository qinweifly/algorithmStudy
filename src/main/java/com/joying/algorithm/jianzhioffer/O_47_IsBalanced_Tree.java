package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 */
public class O_47_IsBalanced_Tree {
    public boolean isBalanced_Tree(TreeNode root) {
        if (root == null) return true;
        return depth(root) != -1;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(root.left);
        if (left == -1) return -1;
        int right = depth(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }
}
