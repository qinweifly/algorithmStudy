package com.joying.algorithm.jianzhioffer;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 */
public class O_28_VerifySquenceOfBST {
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return isBST(sequence, 0, sequence.length - 1);
    }

    private static boolean isBST(int[] sequence, int start, int end) {
//        if (start < 0 || end < 0 || start == end) return true;
        if (start >= end) return true;
        int value = sequence[end];
        int split = start;
        for (; split < end && sequence[split] < value; split++) ;
        for (int i = split; i < end; i++) {
            if (sequence[i] < value) return false;
        }
        return isBST(sequence, start, split -1) && isBST(sequence, split, end - 1);
    }


    public static void main(String[] args) {
        int[] a = new int[]{4, 6, 7, 5};
        int[] b = new int[]{1, 2, 3, 4, 5};
        int[] c = new int[]{5, 4, 3, 2, 1};
        int[] d = new int[]{4,8,6,12,16,14,10};
//        System.out.println("VerifySquenceOfBST1() = " + VerifySquenceOfBST1(a));
//        System.out.println("VerifySquenceOfBST1() = " + VerifySquenceOfBST1(b));
//        System.out.println("VerifySquenceOfBST() = " + VerifySquenceOfBST(a));
//        System.out.println("VerifySquenceOfBST() = " + VerifySquenceOfBST(b));
        System.out.println("VerifySquenceOfBST(c) = " + VerifySquenceOfBST(c));
        System.out.println("VerifySquenceOfBST(d) = " + VerifySquenceOfBST(d));


    }
}
