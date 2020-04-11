package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * <p>
 * 二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，从而使得内存中建立起来的二叉树可以持久保存。
 * 序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，序列化的结果是一个字符串，序列化时通过
 * 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。
 * <p>
 * 二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树
 */
public class O_39_SerializeAndDeSerializeTree {
    int index = -1;

    public String Serialize(TreeNode root) {
        if (root == null)
            return "#";
        else
            return root.val + "!" + Serialize(root.left) + "!" + Serialize(root.right);
    }

    public TreeNode Deserialize(String str) {
        String[] retList = str.split("!");
        index++;
        if (index > retList.length) return null;
        TreeNode treeNode = null;
        if (!retList[index].equals("#")) {
            treeNode = new TreeNode(Integer.parseInt(retList[index]));
            treeNode.left = Deserialize(str);
            treeNode.right = Deserialize(str);
        }
        return treeNode;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;

        O_39_SerializeAndDeSerializeTree serializeTree = new O_39_SerializeAndDeSerializeTree();

        String str = serializeTree.Serialize(treeNode1);
        System.out.println("str = " + str);
        TreeNode treeNode = serializeTree.Deserialize(str);
        System.out.println("treeNode = " + treeNode);
    }
}
