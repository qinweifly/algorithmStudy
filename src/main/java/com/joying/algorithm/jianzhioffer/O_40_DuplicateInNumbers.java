package com.joying.algorithm.jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。例如，
 * 如果输入长度为7的数组{2,3,1,0,2,5,3}，
 * 那么对应的输出是第一个重复的数字2
 */
public class O_40_DuplicateInNumbers {
    /**
     * 通过数字的 index 和数字值相等来判断重复数字，每次操作会移动数组
     * 时间复杂度为 O(n) 空间复杂度为 O(1)
     *
     * @param numbers
     * @param length
     * @param duplicate
     * @return
     */
    public static boolean duplicate(int[] numbers, int length, int[] duplicate) {
        if (length < 0 || numbers == null) return false;
        int index = 0;
        while (index < length) {
            if (index == numbers[index])
                index++;
            else {
                int temp = numbers[index];
                if (temp == numbers[temp]) { //判断index和对应位置的值是不是相等
                    duplicate[0] = temp;
                    return true;
                } else { //进行位置交换
                    numbers[index] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
        }
        return false;
    }

    /**
     * 通过 Map 写入值的数量来确定重复的数字
     *
     * @param numbers
     * @param length
     * @param duplicate
     * @return
     */
    public static boolean duplicate1(int[] numbers, int length, int[] duplicate) {
        if (length < 0 || numbers == null) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            int value = map.getOrDefault(number, 0);
            map.put(number, value + 1);
        }
        for (int number : numbers) {
            int value = map.get(number);
            if (value == 2){
                duplicate[0] = number;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 6, 7, 0, 2, 3, 4, 7, 6};
        int[] ints = {5, 7, 6, 0, 2, 3, 7, 6, 1};
        int[] duplication = new int[2];
        System.out.println("duplicate(ints,9,duplication) = " + duplicate(ints, 9, duplication));
        System.out.println("duplication = " + duplication[0]);
        System.out.println("duplicate1(ints,9,duplication) = " + duplicate1(ints, 9, duplication));
        System.out.println("duplication 1 = " + duplication[0]);

    }
}
