package com.joying.algorithm.jianzhioffer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class O_09_IsPopOrder {

    public static boolean isPopOrder(int[] pushA, int[] popA) {
        /**
         * 首先需要一个栈，列表
         * 按照pushA的方式压入栈
         * 弹出时候需要循环判断是否需要弹出
         * 判断是否需要的弹出的时机，刚刚压入过后就判断
         * 判断需要弹出的情况的条件，压入栈的顶部和弹出栈的顶部数据相等
         */
        if (pushA.length == 0 || pushA.length != popA.length)
            return false;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int j = 0; j < pushA.length; j++) {
            stack.push(pushA[j]);
            while (!stack.isEmpty() && stack.peek() == popA[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
