package com.joying.algorithm.commonutil;

/**
 * 数组中元素交换
 */
public class SwapUtil {

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
