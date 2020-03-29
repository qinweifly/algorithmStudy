package com.joying.algorithm.interviewtest;

import org.springframework.boot.ansi.AnsiOutput;

import java.util.*;

/**
 * 2020/3/27 面试算法题 1：
 * 给定一个非空整数数组，除了某个元素只出现一次，其余元素均出现两次。
 * 找出那个只出现一个的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度，你可以不使用额外空间来实现吗？
 * 示例1： 输入【2，2，1】
 * 输出 1
 * 示例2：输入【4，1,2,1,2】
 * 输出 4
 */
public class SingleNumbers {
    /**
     * 采用异或的形式  0^任何数 = 任何数
     * 任何数 ^ 本身 = 本身
     * a ^ b ^ c = a ^ c ^ b
     *
     * @param nums
     * @return 时间复杂度 O(n)
     */
    public static int singleNumbers(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
    /**
     * 通过将值放入map中，遍历map中每个数，通过出现的次数来判断
     *这样的时间复杂度O(n)，空间复杂度O(n)
     * @param nums
     * @return
     */
    public static int[] singleNumbers1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> reset = new ArrayList<>();
        /**
         * 遍历map中每个数
         * key数字 value该数字出现次数
         * 判断下n在不在map中
         * 不在，出现次数是 1
         * 在，出现次数加 1
         */
        for (int n : nums) {
            int value = map.getOrDefault(n, 0);
            map.put(n, value + 1);
        }
        /**
         * keySet();  取出所有的key  取出所有的数字
         * values();   取出所有的value(但是不能遍历key)  取出所有的出现次数
         * entrySet();   所有的数字及其出现次数的键值对
         */
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            /**Map.Entry<Integer,Integer> 实际上一个类型：
             *  1、静态内部类 Map.Entry Entry是一个类型，但是这个类型是挂靠在外部类Map之中的
             *  2、泛型 有两个类型变量   <K的类型，V的类型>
             */
            int number = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                reset.add(number);
            }
        }
        //第二种通过keySet()获取map里面的key、value
//        for (Integer key : map.keySet()) {
//            int number1 = key;
//            int cnt1 = map.get(key);
//            if (cnt1 == 1) {
//                reset.add(number1);
//            }
//        }
        int[] reNums = new int[reset.size()];
        int i = 0;
        for (Integer I : reset) {
            reNums[i] = I;
            i++;
        }
        return reNums;
    }

    public static int singleNumbers2(int[] nums) {
        List<Integer> re = new ArrayList<>();
        int index = 0;
        boolean flag = true;
        re.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            for (Integer integer : re) {
                if (integer == nums[i]) {
                    re.remove(integer);
                    flag = false;
                    break;
                }
            }
            if (flag)
                re.add(nums[i++]);
        }
        return re.get(0);
    }

    public static void main(String[] args) {
        int[] a = new int[]{2, 2, 1};
        int[] b = new int[]{4, 1, 2, 1, 2};
        final int[] b1 = new int[]{4, 1, 2, 1, 2, 5};
        int[] b2 = new int[]{4, 1, 2, 1, 2, 5, 4};
//        System.out.println(singleNumbers(a));
//        System.out.println(singleNumbers(b));
        System.out.println(singleNumbers2(a));
        System.out.println(singleNumbers2(b));
        System.out.println(singleNumbers2(b1));
        System.out.println(singleNumbers2(b2));
//        System.out.println(Arrays.toString(singleNumbers1(b1)));
//        int[] arr = singleNumbers1(b1);
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        System.out.println(singleNumbers1(b2));
    }
}
