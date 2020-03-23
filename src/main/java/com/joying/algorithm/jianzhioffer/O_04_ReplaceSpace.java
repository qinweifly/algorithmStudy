package com.joying.algorithm.jianzhioffer;

public class O_04_ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }

    public static String replaceSpace1(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (s == ' ')
                sb.append("%20");
            else
                sb.append(s);
        }
        return sb.toString();
    }
}
