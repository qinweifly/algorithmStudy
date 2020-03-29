package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.ListNode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class O_13_Merge {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode newHead = list1.val < list2.val ? list1 : list2;
        ListNode pTemp1 = list1;
        ListNode pTemp2 = list2;
        if (newHead == pTemp1)
            pTemp1 = pTemp1.next;
        else pTemp2 = pTemp2.next;
        ListNode prePointer = newHead;
        while (pTemp1 != null && pTemp2 != null) {
            if (pTemp1.val < pTemp2.val) {
                prePointer.next = pTemp1;
                prePointer = pTemp1;
                pTemp1 = pTemp1.next;
            } else {
                prePointer.next = pTemp2;
                prePointer = pTemp2;
                pTemp2 = pTemp2.next;
            }
        }
        if (pTemp1 == null)
            prePointer.next = pTemp2;
        else
            prePointer.next = pTemp1;

        return newHead;
    }
}
