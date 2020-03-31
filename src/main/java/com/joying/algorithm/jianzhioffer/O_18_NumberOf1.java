package com.joying.algorithm.jianzhioffer;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class O_18_NumberOf1 {
    public static int numberOf1(int n) {
        /**
         * 补码：正数不变，负数是它的正数的反码 + 1
         */
        int num = 0;
        while (n != 0) {
            num++;
            n &= (n - 1);
        }
        return num;
    }
}
