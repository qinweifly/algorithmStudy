package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 */
public class O_32_TreeConvertToLinkedList {


    public TreeNode convertByRecursion(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        TreeNode leftNode = convertByRecursion(pRootOfTree.left);
        TreeNode rightNode = convertByRecursion(pRootOfTree.right);
        TreeNode retNode = leftNode;
        if (leftNode != null)
            leftNode = findRight(leftNode);
        else
            retNode = pRootOfTree;
        pRootOfTree.left = leftNode;
        pRootOfTree.right = rightNode;
        if (leftNode != null)
            leftNode.right = pRootOfTree;
        if (rightNode != null)
            leftNode.left = pRootOfTree;

        return retNode;
    }

    public TreeNode findRight(TreeNode root) {
        while (root.right != null)
            root = root.right;
        return root;
    }

    /**
     * 采用暴力取值方法
     * 先进行中序遍历，然后将值放入list中
     * 在遍历将list中的值进行双向链接
     *
     * @param pRootOfTree
     * @return
     */
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        return ConvertToLinkedList(midOrder(pRootOfTree, new ArrayList<TreeNode>()));
    }

    public ArrayList<TreeNode> midOrder(TreeNode root, ArrayList<TreeNode> list) {
        if (root.left != null)
            midOrder(root.left, list);
        list.add(root);
        if (root.right != null)
            midOrder(root.right, list);
        return list;
    }

    public TreeNode ConvertToLinkedList(ArrayList<TreeNode> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }
}
