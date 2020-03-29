package com.joying.algorithm.jianzhioffer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法
 */
public class O_08_StackIncludeMin {
    Stack<Integer> stack = new Stack<>();
    public void push(int node) {
        stack.add(node);
    }

    public void pop() {
        if (stack.isEmpty())
            stack.pop();
    }

    public int top() {
        return stack.get(-1);
    }

    public int min() {
        return 0;
    }
}
