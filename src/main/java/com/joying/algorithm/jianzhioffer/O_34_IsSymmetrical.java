package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的
 */
public class O_34_IsSymmetrical {
    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return isMirror(pRoot.left, pRoot.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
