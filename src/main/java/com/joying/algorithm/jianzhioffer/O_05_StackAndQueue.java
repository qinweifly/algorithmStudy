package com.joying.algorithm.jianzhioffer;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 */

import java.util.Stack;

public class O_05_StackAndQueue {
    Stack<Integer> stack1 = new Stack<Integer>();  //OutStack
    Stack<Integer> stack2 = new Stack<Integer>();  //InStack

    public void push(int node) {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }
}
