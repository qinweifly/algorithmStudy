package com.joying.algorithm.jianzhioffer;

import com.sun.org.apache.regexp.internal.RE;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * <p>
 * 最小值一定比前面的值要小
 * 使用二分法：找左右的方法是：右边的值大于中值，就说明最小值得左边
 */
public class O_06_MinNumberInRotateArray {
    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (mid == array.length - 1) return array[mid];
            if (mid == 0) {
                if (array[mid] > array[mid +1]) return array[mid+1];
                else return array[mid];
            }
            if (array[mid] < array[mid - 1]) {
                return array[mid];
            } else if (array[mid] < array[right]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }
}
