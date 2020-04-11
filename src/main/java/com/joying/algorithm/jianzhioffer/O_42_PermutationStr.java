package com.joying.algorithm.jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的
 * 所有字符串abc,acb,bac,bca,cab和cba
 * <p>
 * 输入描述：输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母
 */
public class O_42_PermutationStr {
    private ArrayList<String> result = new ArrayList<>();

    public ArrayList<String> permutation(String str) {
        if (str == null || str.length() == 0) return result;
        if (str.length() == 1) {
            result.add(str);
            return result;
        }
        //将str转换为ArrayList数组
        String[] strings = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
        //定义一个进行辅助的方法进行递归
        StringBuilder sb = new StringBuilder();
        permutationHelp(list, sb);
        //返回结果值
        return result;
    }

    private void permutationHelp(ArrayList<String> list, StringBuilder sb) {
        //先判断size是否等于一
        if (list.size() == 1) {
            sb.append(list.get(0));
            int index =result.indexOf(sb.toString());
            if (index == -1)
                result.add(sb.toString());
            return;
        }
        //进行循环
        for (int i = 0; i < list.size(); i++) {
            //放入之前值的路径
            StringBuilder newSb = new StringBuilder(sb.toString());
            //放入当前值的路径
            newSb.append(list.get(i));
            //删除当前放入值得 i
            ArrayList<String> tempList = new ArrayList<String>(list);
            tempList.remove(i);
            //使用剩下的元素继续递归
            permutationHelp(tempList, newSb);
        }
    }

    public static void main(String[] args) {
        O_42_PermutationStr permutation = new O_42_PermutationStr();
        String str1 = "abcdc";
        String str = "a";
        ArrayList<String> list = permutation.permutation(str);
        System.out.println("permutation(str) = " + list);
        System.out.println("list.size = " + list.size());

    }
}
