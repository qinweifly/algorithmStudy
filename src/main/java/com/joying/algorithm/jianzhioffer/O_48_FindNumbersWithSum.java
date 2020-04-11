package com.joying.algorithm.jianzhioffer;

import java.util.ArrayList;

/**
 *输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 *如果有多对数字的和等于S，输出两个数的乘积最小的
 */
public class O_48_FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array.length <= 1) return result;
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            //最前和最后两个数的乘积就是最小的
            if (array[startIndex] + array[endIndex] == sum) {
                result.add(array[startIndex]);
                result.add(array[endIndex]);
                break;
            } else if (array[startIndex] + array[endIndex] < sum)
                startIndex++;
            else
                endIndex--;
        }
        return result;
    }
}
