package com.joying.algorithm.jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2
 * 如果不存在则输出0
 */
public class O_20_MoreThanHalfNum {
    public int moreThanHalfNum(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : array){
            int value = map.getOrDefault(num,0);
            map.put(num, value + 1);
        }
        for(Integer key : map.keySet()){
            int value = map.get(key);
            if(value > array.length / 2)
                return key;
        }
        return 0;
    }
}
