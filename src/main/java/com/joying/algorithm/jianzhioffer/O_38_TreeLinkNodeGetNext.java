package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeLinkNode;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针
 */
public class O_38_TreeLinkNodeGetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        /**
         * 寻找右子树，如果存在就一直找到右子树的最左边就是下一个节点
         * 没有右子树，就寻找他的父节点，一直找到他是父节点的左子树，打印父节点
         */
        if (pNode.right != null) {
            TreeLinkNode tempNode = pNode.right;
            while (tempNode.left != null)
                tempNode = tempNode.left;
            return tempNode;
        } else {
            TreeLinkNode tempNode = pNode;
            while (tempNode.next != null) {
                if (tempNode.next.left == tempNode)
                    return tempNode.next;
                tempNode = tempNode.next;
            }
            return null;
        }
    }
}