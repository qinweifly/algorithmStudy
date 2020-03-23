package com.joying.algorithm.jianzhioffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 * 0 0
 * 1 1
 * 2 2
 * 3 3
 * 4 5  1111 121 22 211  112
 * 5 8
 * ......
 * f(n)的時候跳一步有f(n-1)+f(n-2)
 */
public class O_01_JumpFloor {
    public static int JumpFloor(int target) {
        if (target < 3) {
            return target;
        }
        int set = 0;
        int a = 1;
        int b = 2;
        for (int i = 3; i <= target; i++) {
            set = a + b;
            a = b;
            b = set;
        }
        return set;
    }

    /**
     * 递归方法
     * @param n
     * @return
     */
    public static int JumpFloor2(int n) {
        if (n < 3) {
            return n;
        }
        return JumpFloor2(n-1) +JumpFloor2(n-2);
    }
}
