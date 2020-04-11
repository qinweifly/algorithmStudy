package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class O_25_HasSubtree {
    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        boolean result = false;
        if (root1.val == root2.val)
            result = hasEqual(root1, root2);
        if (!result) result = HasSubtree(root1.left,root2);
        if (!result) result = HasSubtree(root1.right,root2);
        return result;
    }

    private static boolean hasEqual(TreeNode root1, TreeNode root2) {
        if (root2 ==null) return true;
        if (root1 ==null) return false;
        if (root1.val != root2.val) return false;
        return hasEqual(root1.left,root2.left)&&hasEqual(root1.right,root2.right);
    }
}
