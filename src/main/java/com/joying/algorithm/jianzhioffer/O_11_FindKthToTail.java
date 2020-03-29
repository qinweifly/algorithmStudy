package com.joying.algorithm.jianzhioffer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 *
 */

import com.joying.algorithm.commonutil.ListNode;

import java.util.ArrayList;
import java.util.List;

public class O_11_FindKthToTail {
    public static ListNode FindKthToTail(ListNode head, int k) {
        /**
         * 如果比我们的链表长度还要大的话，我们直接返回null
         * 如果小于链表的长度，我们可以定义两个变量，这两个变量中间间隔k
         */
        ListNode firstPoint = head;
        ListNode secondPoint = head;

        if (head == null || k == 0) return null;
        for (int i = 0; i < k; i++) {
            if (firstPoint == null) return null;
            firstPoint = firstPoint.next;
        }
        while (firstPoint !=null){
            firstPoint = firstPoint.next;
            secondPoint = secondPoint.next;
        }
        return secondPoint;
    }
}
