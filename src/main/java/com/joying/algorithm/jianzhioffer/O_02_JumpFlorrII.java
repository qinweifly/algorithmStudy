package com.joying.algorithm.jianzhioffer;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * 1   1
 * 2   2
 * 3   4
 * 4   8
 * ....
 * n   2^(n-1)
 * f(n) = f(n-1) + f(n-2) + ... + f(1)
 * f(n-1) = f(n-2) + f(n-3) + ... + f(1)
 *f(n) = 2f(n-1)  n>1
 */
public class O_02_JumpFlorrII {
    public static int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }

    public static int JumpFloorII1(int target) {
        if (target == 1) return target;
        int a = 1;
        for (int i = 2; i <= target; i++) {
            a = 2 * a;
        }
        return a;
    }
}
