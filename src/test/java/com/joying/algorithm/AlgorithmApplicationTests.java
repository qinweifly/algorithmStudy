package com.joying.algorithm;

import com.joying.algorithm.jianzhioffer.O_02_JumpFlorrII;
import com.joying.algorithm.tenclassicalsort.BubbleSort;
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

        int jumpFloorII = O_02_JumpFlorrII.JumpFloorII(2);
        System.out.println(jumpFloorII);
        int jumpFloorII1 = O_02_JumpFlorrII.JumpFloorII1(2);
        System.out.println(jumpFloorII1);
        System.out.println(jumpFloorII == jumpFloorII1);

        int[] a = new int[]{1, 3, 5, 32, 1, 2, 3};
        BubbleSort.bubbleSort(a);
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }
}
