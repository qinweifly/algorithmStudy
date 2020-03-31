package com.joying.algorithm.jianzhioffer;

/**
 * 有个游戏是这样的: 首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到 m-1 的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
 * 从他的下一个小朋友开始,继续 0...m-1 报数....这样下去....直到剩下最后一个小朋友,
 * 可以不用表演,并且拿到名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 *
 * 如果没有小朋友，请返回-1
 */
public class O_16_LastRemaining {
    /**
     * 此问题是一个经典的约瑟夫环问题
     * 假设输入 lastRemaining(10, 3)
     * 我们此时用f(n)表示 n 个人的时候，能够存活的位置索引
     * 显然可以得到f(1)=0,f(2)=1,...,f(10)=3，但是我们要找的是通项公式
     * 当n=9时d的位置索引就是n=10时循环左移了3位，那么可以得到f(10) = (f9 + 3) % 10
     * 因为是循环左移，所以需要加一个取余，防止越界
     * 同理可以得到f(3) = (f(2)+3) % 3，f(2) = (f(1) + 3) % 2
     * 从始至终，m只是一个常量，所以不影响结论。所以约瑟夫环问题的公式：
     * f(n,m) = (f(n-1, m) + m) mod n
     *
     * @param n
     * @param m
     * @return
     */
    public static int lastRemaining(int n, int m) {
        if (n == 0 || m < 1) return -1;
        if (n == 1) return 0;
        int value = 0;
        for (int i = 2; i <= n; i++) {
            value = (value + m) % i;
        }
        return value;
    }

    public static int lastRemainingByRecursion(int n, int m) {
        if (n == 0 || m < 1) return -1;
        if (n == 1) return 0;
        return (lastRemainingByRecursion((n - 1), m) + m) % n;
    }
}
