package com.joying.algorithm.commonutil;

import java.util.Stack;

public class TreeSearch {
    //先序遍历,递归实现
    public static void preOrderRecursion(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + "  ");
        preOrderRecursion(root.left);
        preOrderRecursion(root.right);
    }

    //中序遍历,递归实现
    public static void midOrderRecursion(TreeNode root) {
        if (root == null) return;
        midOrderRecursion(root.left);
        System.out.print(root.val + "  ");
        midOrderRecursion(root.right);
    }

    //后序遍历,递归实现
    public static void latOrderRecursion(TreeNode root) {
        if (root == null) return;
        latOrderRecursion(root.left);
        latOrderRecursion(root.right);
        System.out.print(root.val + "  ");
    }

    //先序遍历，非递归方式实现
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tempNode = root;
        System.out.print("先序遍历的非递归方式:" + "  ");
        while (tempNode != null || !stack.isEmpty()) {
            while (tempNode != null) {
                System.out.print(tempNode.val + "  ");
                stack.push(tempNode);
                tempNode = tempNode.left;
            }
            if (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                tempNode = node.right;
            }
        }
    }

    //中序遍历，非递归方式实现
    public static void midOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tempNode = root;
        System.out.print("中序遍历的非递归方式:" + "  ");
        while (tempNode != null || !stack.isEmpty()) {
            while (tempNode != null) {
                stack.push(tempNode);
                tempNode = tempNode.left;
            }
            if (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                System.out.print(node.val + "  ");
                tempNode = node.right;
            }
        }
    }

    //后序遍历，非递归方式实现
    public static void latOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tempNode = root;
        System.out.print("后序遍历的非递归方式:" + "  ");
        while (tempNode != null || !stack.isEmpty()) {
            while (tempNode != null) {
                stack.push(tempNode);
                tempNode = tempNode.left;
            }
            if (!stack.isEmpty()) {
                TreeNode node = stack.peek();
                tempNode = node.right;
                if (node.right == null) {
                    node = stack.pop();
                    System.out.print(node.val + "  ");
                    while (!stack.isEmpty() && node == stack.peek().right) {
                        node = stack.pop();
                        System.out.print(node.val + "  ");
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
//        TreeNode t9 = new TreeNode(9);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
//        t5.right = t9;
        t3.left = t6;
        t3.right = t7;
        t6.right = t8;

        System.out.print("先序遍历的  递归方式:" + "  ");
        preOrderRecursion(t1);
        System.out.println();
        System.out.print("中序遍历的  递归方式:" + "  ");
        midOrderRecursion(t1);
        System.out.println();
        System.out.print("后序遍历的  递归方式:" + "  ");
        latOrderRecursion(t1);
        System.out.println();
        preOrder(t1);
        System.out.println();
        midOrder(t1);
        System.out.println();
        latOrder(t1);

    }

}
