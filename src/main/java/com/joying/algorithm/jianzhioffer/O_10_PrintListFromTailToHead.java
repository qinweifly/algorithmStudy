package com.joying.algorithm.jianzhioffer;

import com.joying.algorithm.commonutil.ListNode;
import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 */
public class O_10_PrintListFromTailToHead {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ListNode pTemp = listNode;
        ArrayList<Integer> arr = new ArrayList<>();
        while (listNode != null) {
            arr.add(0, listNode.val);
            listNode = listNode.next;
        }
        return arr;
    }
}
