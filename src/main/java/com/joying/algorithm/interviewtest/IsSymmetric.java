package com.joying.algorithm.interviewtest;

import com.joying.algorithm.commonutil.TreeNode;

/**
 * 2020/3/27 面试算法题 3：
 * 给定一个二叉树，检查它是否是镜像对称的。
 *   例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *      1
 *     / \
 *    2   2
 *   / \ / \
 *  3  4 4  3
 *   但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *      1
 *     / \
 *    2   2
 *     \   \
 *    3    3
 */
public class IsSymmetric {
    /**
     * 采用递归的方式
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
