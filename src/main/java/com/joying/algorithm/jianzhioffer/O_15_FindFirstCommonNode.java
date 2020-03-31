package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.ListNode;

/**
 * 输入两个链表，找出它们的第一个公共结点
 * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */
public class O_15_FindFirstCommonNode {
    /**
     * 通过比较两个链表的长度，按照后长度进行逐个比较
     * 时间复杂度 O(n)
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode pTemp1 = pHead1;
        ListNode pTemp2 = pHead2;
        while (pTemp1 != null && pTemp2 != null) {
            if (pTemp1 == pTemp2) return pTemp1;
            pTemp1 = pTemp1.next;
            pTemp2 = pTemp2.next;
        }
        if (pTemp1 != null) {
            return findNewHead(pTemp1, pHead1, pHead2);
        }
        if (pTemp2 != null) {
            return findNewHead(pTemp2, pHead2, pHead1);
        }
        return null;
    }
    private static ListNode findNewHead(ListNode pTempLong, ListNode pHeadLong, ListNode pHeadShort) {
        int count = 0;
        while (pTempLong != null) {
            pTempLong = pTempLong.next;
            count++;
        }
        pTempLong = pHeadLong;
        ListNode pTempShort = pHeadShort;
//        for (int i = 0; i < count; i++) {
//            pTempLong = pTempLong.next;
//        }
        while (count-- > 0)
            pTempLong = pTempLong.next;
        while (pTempLong != pTempShort) {
            pTempLong = pTempLong.next;
            pTempShort = pTempShort.next;
        }
        return pTempLong;
    }


    /**
     * 使用双重循环
     * 时间复杂度O(n^2)
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode findFirstCommonNodeByRecursion(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)
            return null;
        ListNode pTemp1 = pHead1;
        while (pTemp1 != null) {
            ListNode pTemp2 = pHead2;
            while (pTemp2 != null) {
                if (pTemp1 == pTemp2)
                    return pTemp1;
                pTemp2 = pTemp2.next;
            }
            pTemp1 = pTemp1.next;
        }
        return null;
    }
}
