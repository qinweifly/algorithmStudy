package com.joying.algorithm.jianzhioffer;

/**
 * 输入一个链表，反转链表后，输出新链表的表头
 */

import com.joying.algorithm.commonutil.ListNode;

public class O_12_ReverseList {
    public static ListNode ReverseList(ListNode head) {

        /**
         * 1、將现有的头换成尾，尾部的next置空
         * 2、将从第二个node开始，循环将next指向前一个
         * 3、需要一直有一个指针指向还没有反转的头部
         */
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode leftPointer = head;
        ListNode minPointer = head.next;
        ListNode rightPointer = minPointer.next;
        leftPointer.next = null;
        while (rightPointer != null) {
            minPointer.next = leftPointer;
            leftPointer = minPointer;
            minPointer = rightPointer;
            rightPointer = rightPointer.next;
        }
        minPointer.next = leftPointer;
        return minPointer;
    }
}
