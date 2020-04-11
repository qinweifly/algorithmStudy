package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.TreeNode;
import com.joying.algorithm.commonutil.TreeSearch;
import org.springframework.util.StringUtils;

import java.util.Arrays;

public class O_24_ReconstructBinaryTree {
    public static TreeNode reconstructBinaryTree(int[] pre, int[] in) throws Exception {
        //if (pre == null || in == null || pre.length != in.length) return null;
        if (pre == null || in.length == 0 || pre.length != in.length) return null;
        TreeNode root = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                root.left = reconstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                root.right = reconstructBinaryTree(Arrays.copyOfRange(pre, i + 1, in.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return root;
    }

    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] b = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode treeNode = reconstructBinaryTree(a, b);
        TreeSearch.preOrderRecursion(treeNode);
        System.out.println();
        TreeSearch.midOrderRecursion(treeNode);
        System.out.println();
        TreeSearch.latOrderRecursion(treeNode);
    }
}
