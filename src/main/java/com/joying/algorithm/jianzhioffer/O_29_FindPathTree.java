package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class O_29_FindPathTree {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        if (root == null) return result;
        list.add(root.val);
        target -= root.val;
        boolean insertFlag = true;
        if (target == 0 && root.left == null && root.right == null) {
            if (result.size() != 0) {
                for (int i = 0; i < result.size(); i++) {
                    if (result.get(i).size() < list.size()) {
                        result.add(i, new ArrayList<>(list));
                        insertFlag = false;
                        break;
                    }
                }
                if (insertFlag) {
                    result.add(new ArrayList<>(list));
                }
            } else {
                result.add(new ArrayList<>(list));
            }
        }
        //在每一次的递归中，使用的是相同的result引用，所以对于左右子树递归得到的结果不需要关心
        findPath(root.left, target);
        findPath(root.right, target);
        list.remove(list.size() - 1);
        return result;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(16);
        TreeNode t14 = new TreeNode(6);
        TreeNode t24 = new TreeNode(4);
        TreeNode t34 = new TreeNode(6);
        TreeNode t5 = new TreeNode(9);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(11);
        TreeNode t8 = new TreeNode(3);
        TreeNode t9 = new TreeNode(2);
        TreeNode t10 = new TreeNode(1);
        TreeNode t11 = new TreeNode(0);
        TreeNode t12 = new TreeNode(0);

        t1.left = t2;
        t1.right = t5;
        t2.left = t3;
//        t2.right = t4;
        t2.left = t14;
        t14.left = t24;
        t24.left = t34;
        t5.left = t6;
        t5.right = t7;
        t6.left = t8;
        t6.right = t9;
        t9.right = t10;
        t10.right = t11;
        t11.left = t12;

        O_29_FindPathTree findPathTree = new O_29_FindPathTree();
        ArrayList<ArrayList<Integer>> path = findPathTree.findPath(t1, 23);
        for (ArrayList<Integer> list : path) {
            System.out.println("list = " + list);
        }
    }
}
