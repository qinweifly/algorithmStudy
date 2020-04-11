package com.joying.algorithm.jianzhioffer;

import java.util.Arrays;

/**
 * 统计一个数字在排序数组中出现的次数
 */
public class O_45_GetNumberOfK {
    /**
     * 暴力循环求解法
     * 时间复杂度 O(n)
     * @param array
     * @param k
     * @return
     */
    public int getNumberOfK(int[] array, int k) {
        int count = 0;
        for (int i : array) {
            if (i == k) count++;
            //else if (count != 0 && i != k) break;
        }
        return count;
    }

    /**
     * 二分法查找
     * 时间复杂度 O(logn)
     * @param array
     * @param k
     * @return
     */
    public static int getNumberOfKByBinary(int[] array, int k) {
        int index = Arrays.binarySearch(array, k);
        if (index < 0 ) return 0;
        int count = 1;
        for (int i = index - 1; i >= 0 && array[i] == k; i--)
            count++;
        for (int i = index + 1; i < array.length && array[i] == k; i++)
            count++;
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 3, 3, 4, 5};
        System.out.println(getNumberOfKByBinary(arr, 2));
    }
}
