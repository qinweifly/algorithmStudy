package com.joying.algorithm.interviewtest;

/**
 * 2020/3/27 面试 Java 基础题：
 */
public class ExceptionTest {
    public static int getDivision(int n){
        try {
            n+=1;
            if (n/0 >0){
                n+=10;
            }else {
                n-=10;
            }
            return n;
        }catch (Exception e){
            n++;
        }
        n++;
        return n++;
    }

    public static void main(String[] args) {
        System.out.println("getDivision(10) = " + getDivision(10));   //输出 13
    }
}

