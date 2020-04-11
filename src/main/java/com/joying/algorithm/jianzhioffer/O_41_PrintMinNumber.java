package com.joying.algorithm.jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
 */
public class O_41_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        StringBuffer result = new StringBuffer();
        ArrayList<String> list = new ArrayList<>();
        for (int number : numbers) list.add(Integer.toString(number));

        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
//        Collections.sort(list,(o1,o2)->(o1+o2).compareTo(o2+o1));

//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                String s1 = o1 + "" + o2;
//                String s2 = o2 + "" + o1;
//                return s1.compareTo(s2);
//            }
//        });

//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                String s1 = o1 +""+ o2;
//                String s2 = o2 +""+ o1;
//                return s1.compareTo(s2);
//            }
//        });
        for (String num : list) result.append(num);
        return result.toString();
    }
}
