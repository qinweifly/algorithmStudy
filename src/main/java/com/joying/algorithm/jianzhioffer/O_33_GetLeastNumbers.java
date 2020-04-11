package com.joying.algorithm.jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4
 */
public class O_33_GetLeastNumbers {
    public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length < k || k <= 0) return list;
        int[] maxHeap = new int[k];
        for (int i = 0; i < k; i++) {
            maxHeap[i] = input[i];
        }
        creatMaxHeap(maxHeap);
        for (int i = k; i < input.length; i++) {
            adjustMaxHeap(maxHeap, input[i]);
        }
        Arrays.sort(maxHeap);
        for (int i = 0; i < maxHeap.length; i++) {
            list.add(maxHeap[i]);
        }
        return list;
    }

    /**
     * 创建最大堆
     */
    private void creatMaxHeap(int[] maxHeap) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < maxHeap.length; i++) {
            nums.add(maxHeap[i]);
            int currentIndex = nums.size() - 1;
            while (currentIndex != 0) {
                int parentIndex = (currentIndex - 1) >> 1;
                if (nums.get(parentIndex) < nums.get(currentIndex)) {
                    Collections.swap(nums, currentIndex, parentIndex);
                    currentIndex = parentIndex;
                } else break;
            }
        }
        for (int i = 0; i < maxHeap.length; i++) {
            maxHeap[i] = nums.get(i);
        }
    }

    /**
     * 调整最大堆
     */
    private void adjustMaxHeap(int[] maxHeapNum, int num) {
        if (num < maxHeapNum[0]) {
            maxHeapNum[0] = num;
        } else return;
        int index = 0;
        int len = maxHeapNum.length;
        while (index < len) {
            int leftIndex = index * 2 + 1;
            int rightIndex = index * 2 + 2;
            int largerIndex = 0;
            if (rightIndex < len)
                largerIndex = maxHeapNum[rightIndex] < maxHeapNum[leftIndex] ? leftIndex : rightIndex;
            else if (leftIndex < len)
                largerIndex = leftIndex;
            else break;

            if (maxHeapNum[index] < maxHeapNum[largerIndex])
                swap(maxHeapNum, index, largerIndex);
            index = largerIndex;
        }
    }

    /**
     * 将 a , b两个数进行交换
     *
     * @param a
     * @param b
     */
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
