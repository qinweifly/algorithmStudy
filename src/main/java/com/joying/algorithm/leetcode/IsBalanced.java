package com.joying.algorithm.leetcode;

import com.joying.algorithm.commonutil.TreeNode;

public class IsBalanced {

    /**
     * 采用递归方法
     */
    private static boolean isSymmetricFlag = true;
    public static boolean isBalanced(TreeNode root) {
        getDepth(root);
        return isSymmetricFlag;
    }
    private static int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1) isSymmetricFlag = false;
        return Math.max(left, right) + 1;
    }

    /**
     * 采用递归解法
     *
     * @param root
     * @return
     */
    public static boolean isBalanced1(TreeNode root) {
        if (root == null) {
            return true;
        }
        //递归计算每个节点的左右子树高度
        if (!isBalanced1(root.left)) return false;
        if (!isBalanced1(root.right)) return false;

        int leftH = dfs(root.left) + 1;     //计算左子树高度
        int rightH = dfs(root.right) + 1;   //计算右子树高度
        if (Math.abs(leftH - rightH) > 1) {
            return false;
        }
        return true;
    }

    /**
     * 算出每个节点的子树高度
     */
    private static int dfs(TreeNode x) {
        if (x == null) {
            return 0;
        }
        if (x.left == null && x.right == null) {
            return 1;
        }
        int leftH = dfs(x.left) + 1;
        int rightH = dfs(x.right) + 1;
        return Math.max(leftH, rightH);
    }

    public static void main(String[] args) {

    }
}
