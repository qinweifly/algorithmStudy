package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.ListNode;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 */
public class O_17_EntryNodeOfLoop {
    public ListNode entryNodeOfLoop(ListNode pHead) {
        /**
         * 先定义两个指针，其中一个快：跳两步  一个慢：跳一步
         * 循环跳
         * 要么快的指针为空（没有环），要么会到快慢相等（有环）
         */
        if (pHead == null) return null;
        ListNode fastPointer = pHead;
        ListNode slowPointer = pHead;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer)
                break;
        }
        if (fastPointer == null || fastPointer.next == null) return null;
        /**
         * 假设slow走了 l 步，fast走了 2l 步
         * 假设从开始到入口点的长度是s , slow在环里面走的长度是 d
         * 那么 l = s + d
         * 假设 环内 slow 没有走的长度是 m ，fast走的长度是 n * ( m + d) + d + s = 2l
         * n * ( m + d) + d + s = (s + d) * 2
         * s = nm + (n - 1)*d  ----->  s = (n - 1) * (m + d) + m
         */
        fastPointer = pHead;
        while (fastPointer != slowPointer) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;
    }
}
