package com.joying.algorithm.jianzhioffer;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
 */
public class O_21_NumberOf1Between1AndN {

    public static int numberOf1Between1AndN(int n) {
        int precise = 1;
        int highValue = 1;
        int midValue = 1;
        int lowValue = 1;
        int count = 0;
        int sumNum = 0;
        int num = 0;
        while (highValue != 0) {
            highValue = n / (precise * 10);
            midValue = (n / precise) % 10;
            lowValue = n % precise;
            precise *= 10;

            if (midValue == 0)
                num = (int) ((highValue - 1 + 1) * Math.pow(10, count));
            else if (midValue > 1)
                num = (int) ((highValue + 1) * Math.pow(10, count));
            else
                num = (int) ((highValue) * Math.pow(10, count)) + lowValue + 1;
            sumNum += num;
            count += 1;
        }
        return sumNum;
    }

    public static void main(String[] args) {
        System.out.println("numberOf1Between1AndN() = " + numberOf1Between1AndN(621));
    }
}
