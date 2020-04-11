package com.joying.algorithm.jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 */
public class O_43_FirstNotRepeatingChar {
    /**
     * 时间复杂度 O(n) 空间复杂度 O(1)
     * @param str
     * @return
     */
    public static int firstNotRepeatingChar(String str) {
        //int[] counts = new int[127];
        int[] counts = new int[58];
        for (int i = 0; i < str.length(); i++)
            counts[str.charAt(i) - 'A'] += 1;
        for (int i = 0; i < str.length(); i++)
            if (counts[str.charAt(i) - 'A'] == 1)
                return i;
        return -1;
    }

    /**
     * 通过map实现寻找第一个第一次出现的值
     * 时间复杂度 O(n) 空间复杂度 O(n)
     *
     * @param str
     * @return
     */
    public static int firstNotRepeatingChar1(String str) {
        if (str == null || str.length() > 10000) return -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int value = map.getOrDefault(str.charAt(i), 0);
            map.put(str.charAt(i), value + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            int value = map.get(str.charAt(i));
            if (value == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "AasdsasjfiuhdAHSHGakjdAszZ";
        System.out.println("firstNotRepeatingChar(str) = " + firstNotRepeatingChar(str));
        System.out.println("firstNotRepeatingChar1(str) = " + firstNotRepeatingChar1(str));
    }
}
