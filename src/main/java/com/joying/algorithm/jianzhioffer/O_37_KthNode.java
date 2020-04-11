package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

import java.util.ArrayList;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8） 中，
 * 按结点数值大小顺序第三小结点的值为4
 */
public class O_37_KthNode {
    private ArrayList<TreeNode> list = new ArrayList<>();
    public TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <= 0) return null;
        midOrderRecursion(pRoot, k);
        if (list.size() < k) return null;
        return list.get(k - 1);
    }

    private void midOrderRecursion(TreeNode root, int k) {
        if (root == null) return;
        if (list.size() == k) return;
        midOrderRecursion(root.left, k);
        list.add(root);
        midOrderRecursion(root.right, k);
    }
}
