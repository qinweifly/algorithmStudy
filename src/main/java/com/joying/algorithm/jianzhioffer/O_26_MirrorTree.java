package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 */
public class O_26_MirrorTree {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}