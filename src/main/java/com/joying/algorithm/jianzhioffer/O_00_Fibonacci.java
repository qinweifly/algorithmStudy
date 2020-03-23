package com.joying.algorithm.jianzhioffer;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）
 * 0 1 1 2 3 5 8 .....n
 */
public class O_00_Fibonacci {

    public static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static int Fibonacci2(int n) throws Exception {
        if (n < 0) {
            throw new Exception("n必须大于等于0");
        } else if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i < n; i++) {
            b += a;
            a = b;
        }
        return b;
    }

}
