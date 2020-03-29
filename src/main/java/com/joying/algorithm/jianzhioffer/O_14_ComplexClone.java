package com.joying.algorithm.jianzhioffer;
import com.joying.algorithm.commonutil.RandomListNode;

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class O_14_ComplexClone {
    public static RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        //复制一个一样的node，并且添加到之前的链表的每一个node后面
        RandomListNode pTemp = pHead;
        while (pTemp != null) {
            RandomListNode node = new RandomListNode(pTemp.label);
            node.next = pTemp.next;
            pTemp.next = node;
            pTemp = node.next;
        }
        //实现Random的指向   A.next.Random = a.Random.next
        pTemp = pHead;
        while (pTemp != null) {
            if (pTemp.random != null)
                pTemp.next.random = pTemp.random.next;
            pTemp = pTemp.next.next;
        }
        //断开原来node和新的node之间的链接
        pTemp = pHead;
        RandomListNode newHead = pHead.next;
        RandomListNode pNewTemp = pHead.next;
        while (pTemp != null) {
            pTemp.next = pTemp.next.next;
            if (pNewTemp.next != null){
                pNewTemp.next = pNewTemp.next.next;
                pNewTemp = pNewTemp.next;
            }
            pTemp = pTemp.next;
        }
        return newHead;
    }
}
