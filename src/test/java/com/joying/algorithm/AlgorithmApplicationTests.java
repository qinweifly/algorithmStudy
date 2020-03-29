package com.joying.algorithm;

import com.joying.algorithm.commonutil.RandomListNode;
import com.joying.algorithm.interviewtest.ExceptionTest;
import com.joying.algorithm.jianzhioffer.O_14_ComplexClone;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlgorithmApplicationTests {

    @Test
    void contextLoads() throws Exception {
//        int fibonacci = O_00_Fibonacci.Fibonacci(10);
//        System.out.println(fibonacci);
//
//        int fibonacci1 = O_00_Fibonacci.Fibonacci2(10);
//        System.out.println(fibonacci);
//
//        int jumpFloor = O_01_JumpFloor.JumpFloor(10);
//        System.out.println(jumpFloor);
//
//        int jumpFloor1 = O_01_JumpFloor.JumpFloor2(10);
//        System.out.println(jumpFloor);
//        System.out.println(jumpFloor==jumpFloor1);

//        int jumpFloorII = O_02_JumpFlorrII.JumpFloorII(2);
//        System.out.println(jumpFloorII);
//        int jumpFloorII1 = O_02_JumpFlorrII.JumpFloorII1(2);
//        System.out.println(jumpFloorII1);
//        System.out.println(jumpFloorII == jumpFloorII1);
//
//        int[] a1 = new int[]{1, 3, 5, 32, 1, 2, 3};
//        int[] a = new int[]{3,2};
//        BubbleSort.bubbleSort(a);
//        for (int i : a) {
//            System.out.print(i + "  ");
//        }

//        int[] b1 = new int[]{6807,6808,6808,6809,6810,6812,6812,6812,6814,6815,6815,6817,6817,6817,6818,6820,6822,6824,6825,6825,6825,6826,6827,6829,6831,6832,6834,68};
//        int[] b2 = new int[]{1,3};
//        int[] b3 = new int[]{1,1};
//        int[] b = new int[]{2,1,3,4};
//        int minNumberInRotateArray = O_06_MinNumberInRotateArray.minNumberInRotateArray(b);
//        System.out.print(minNumberInRotateArray + "  ");

//        int[] b2 = new int[]{1, 3};
//        int[] b3 = new int[]{1, 1};
//        int[] b4 = new int[]{2, 1, 3, 4};
//        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7};
//        O_07_ReOrderArray.reOrderArray(b);
//        for (int i : b) {
//            System.out.print(i + "  ");
//        }
//        int[] a = new int[]{1,2,3,4,5};
//        int[] b = new int[]{4,5,3,2,1};
//        boolean popOrder = O_09_IsPopOrder.isPopOrder(a, b);
//        System.out.println(popOrder);

//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(3);
//        ListNode l3 = new ListNode(6);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = null;
//        ArrayList<Integer> integers = O_10_PrintListFromTailToHead.printListFromTailToHead(l1);
//        for (Integer integer : integers) {
//            System.out.print(integer + "  ");
//        }

//        ListNode list1 = new ListNode(1);
//        ListNode list11 = new ListNode(3);
//        ListNode list12 = new ListNode(6);
//        list1.next = list11;
//        list11.next = list12;
//        list12.next = null;
//        ListNode list2 = new ListNode(2);
//        ListNode list21 = new ListNode(3);
//        ListNode list22 = new ListNode(5);
//        list2.next = list21;
//        list21.next = list22;
//        list22.next = null;
//        ListNode merge = O_13_Merge.Merge(list1, list2);
//        while (merge != null){
//            System.out.println(merge.val);
//            merge = merge.next;
//        }

//        System.out.println(ExceptionTest.getDivision(10));

        RandomListNode head = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        RandomListNode node6 = new RandomListNode(6);
        RandomListNode node7 = new RandomListNode(7);
        RandomListNode node23 = new RandomListNode(23);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node23;

        head.random = node3;
        node2.random = node5;
        node4.random = node2;

        RandomListNode clone = O_14_ComplexClone.Clone(head);
        while (clone != null){
            System.out.println("clone = " + clone.label);
            clone = clone.next;
        }

    }
}
