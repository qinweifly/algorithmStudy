package com.joying.algorithm.jianzhioffer;

import java.util.Objects;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */
public class O_07_ReOrderArray {
    public static void reOrderArray(int[] array) {
        /**
         * 时间复杂度O(n)
         * 空间复杂度O(n)
         */
        int[] reset = new int[array.length];
        int index = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 != 0) {
                reset[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                reset[index] = array[i];
                index++;
            }
        }
//        int i = 0;
//        int j = 0;
//        int len = reset.length;
//        while (j < len ) array[i++] = reset[j++];
        for (int i = 0; i < reset.length; i++) {
            array[i] = reset[i];
        }
    }
}
