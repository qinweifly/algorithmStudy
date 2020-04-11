package com.joying.algorithm.tenclassicalsort;

/**
 * 快速排序算法
 */
public class QuickSort {
    public static void quickSort(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        sort(nums, 0, nums.length - 1);
    }

    private static void sort(int[] nums, int start, int end) {
        if (start < end) {
            int index = sortUnit(nums, start, end);
            sort(nums, start, index - 1); //对左边进行递归排序
            sort(nums, index + 1, end);  //对右边进行递归排序
        }
    }

    private static int sortUnit(int[] nums, int start, int end) {
        int num = nums[start]; //给定游标
        while (start < end) {
            while (start < end && num <= nums[end]) {
                end--;
            }
            nums[start] = nums[end];
            while (start < end && nums[start] <= num) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = num;
        return start;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 4, 8, 7, 5, 9, 2, 6, 0, 10};
        int[] nums = new int[]{};
        QuickSort.quickSort(nums);
        for (int num : nums) {
            System.out.println("num " + num + " = " + num);
        }
    }
}
