package com.joying.algorithm.jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次
 * 请写程序找出这两个只出现一次的数字
 */
public class O_23_FindNumsAppearOnce {
    public static void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean setFlag = true;
        for (int num : array) {
            int value = map.getOrDefault(num, 0);
            map.put(num, value + 1);
        }
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (value == 1) {
                if (setFlag) {
                    num1[0] = key;
                    setFlag = false;
                } else {
                    num2[0] = key;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 2, 3, 9, 3, 0, 1, 1};
        int[] b = new int[1];
        int[] c = new int[1];
        findNumsAppearOnce(a, b, c);
        System.out.println(b[0] + "    " + c[0]);
    }
}
