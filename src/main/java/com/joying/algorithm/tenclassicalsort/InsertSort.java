package com.joying.algorithm.tenclassicalsort;

public class InsertSort {
    public static void insertSort(int[] array) {
        if (array.length <= 1)
            return;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int leftIndex = i - 1;
            while (0 <= leftIndex && temp < array[leftIndex]) {
                array[leftIndex + 1] = array[leftIndex];
                leftIndex--;
            }
            array[leftIndex + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 4, 8, 7, 5, 9, 2, 6, 0, 10};
        int[] nums = new int[]{};
        InsertSort.insertSort(nums1);
        for (int num : nums1) {
            System.out.println("num:   " + " = " + num);
        }
    }
}
